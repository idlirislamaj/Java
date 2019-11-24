package redischool.Lesson7Inheritance;
import java.util.List;

public class BookingSystemUsingInterfaces {

    // Booking system with 3 types of courses using interface Course

        interface Course {
            String getName();
            boolean isAvailable(int year, String semester);
        }

        static class RegularCourse implements Course {
            private String name;

            RegularCourse(String name) {
                this.name = name;
            }

            @Override
            public String getName() {
                return name;
            }

            @Override
            public boolean isAvailable(int year, String semester) {
                return true;
            }
        }

        static class IrregularCourse implements Course {
            private String name;
            private String semester;

            IrregularCourse(String name, String semester) {
                this.name = name;
                this.semester = semester;
            }

            @Override
            public String getName() {
                return name;
            }

            @Override
            public boolean isAvailable(int year, String semester) {
                if (semester.equals(this.semester)) {  return true; }
                else { return false; }
            }
        }

        static class OnOffCourse implements Course {
            private String name;
            private String semester;
            private int year;

            OnOffCourse(String name, String semester, int year) {
                this.name = name;
                this.semester = semester;
                this.year = year;
            }

            @Override
            public String getName() {
                return name;
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
            int year = 2019;

            System.out.println("Available courses in " + semester + " semester " + year + ":");
            for (Course course : courses) {
                if (course.isAvailable(year, semester)) {
                    System.out.println(course.getName());
                }
            }
        }
    }

