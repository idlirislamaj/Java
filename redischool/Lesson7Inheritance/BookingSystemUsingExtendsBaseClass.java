package redischool.Lesson7Inheritance;

import java.util.List;

public class BookingSystemUsingExtendsBaseClass {
    // Booking system with 3 types of courses using interface Course and base class CourseBase
    public static class BookingSystem2 {

        interface Course {
            String getName();
            boolean isAvailable(int year, String semester);
        }

        static class CourseBase{
            private String name;

            CourseBase(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }

        static class RegularCourse extends CourseBase implements Course {

            RegularCourse(String name){
                super(name);
            }
            @Override
            public boolean isAvailable(int year, String semester) {
                return true;
            }
        }

        static class IrregularCourse extends CourseBase implements Course {
            private String semester;

            IrregularCourse(String name, String semester) {
                super(name);
                this.semester = semester;
            }

            @Override
            public boolean isAvailable(int year, String semester) {
                if (semester.equals(this.semester)) {  return true; }
                else { return false; }
            }
        }

        static class OnOffCourse extends CourseBase implements Course {
            private String semester;
            private int year;

            OnOffCourse(String name, String semester, int year) {
                super(name);
                this.semester = semester;
                this.year = year;
            }

            @Override
            public boolean isAvailable(int year, String semester) {
                if (semester.equals(this.semester) && year == this.year) {  return true; }
                else { return false; }
            }
        }

        public static void main(String[] args) {
            System.out.println("Welcome to our Booking System!");

            List<Course> courses = List.of(new RegularCourse("Java Introduction"),
                    new IrregularCourse("Java Intermediate", "Fall"),
                    new OnOffCourse("Java Advanced", "Fall", 2020));

            String semester = "Fall";
            int year = 2020;

            System.out.println("Available courses in " + semester + " semester " + year + ":");
            for (Course course : courses) {
                if (course.isAvailable(year, semester)) {
                    System.out.println(course.getName());
                }
            }
        }
    }
}
