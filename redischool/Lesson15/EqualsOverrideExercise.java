package redischool.Lesson15;


import java.util.HashSet;
import java.util.Set;

public class EqualsOverrideExercise {


    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        Student tim = new Student(1,"Tim",22);
        Student tom = new Student(2,"Tom",42);
        Student joe = new Student(3 ,"Joe",31);
        Student dan = new Student(4,"Daniel",33);
        Student ana = new Student(5,"Ana",19);
        students.add(tim);
        students.add(tom);
        students.add(joe);
        students.add(dan);
        students.add(ana);

        //System.out.println(students.contains(tim));

        for (Student student: students){
            if (student.hashCode() == ana.hashCode()){
                System.out.println("Ana is there");
            }
        }

    }
}
