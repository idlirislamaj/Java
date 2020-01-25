/*
package redischool.Lesson16;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MainProgram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        Set<Registration> registrationSet = new HashSet<>();
*/
/*        Set<String> course1 = new HashSet<>();
        Set<String> course2 = new HashSet<>();
        Set<String> course3 = new HashSet<>();
        Set<String> course4 = new HashSet<>();*//*

        boolean flag = true;
        while (flag == true){
            System.out.println("Enter the name ");
            String name = in.nextLine();
            System.out.println("Enter course ID");
            String id = in.nextLine();
            registrationSet.add(new Registration(name,id));


        }

*/
/*        Registration registration = new Registration("Tim","2");
        Registration registration1 = new Registration("Tim","1");
        Registration registration2 = new Registration("Tim","3");
        Registration registration3 = new Registration("Tim","2");
        Registration registration4 = new Registration("Tom","2");
        Registration registration5 = new Registration("Ana","4");
        Registration registration6 = new Registration("Charles","1");*//*

*/
/*        registrationSet.add(registration);
        registrationSet.add(registration1);
        registrationSet.add(registration2);
        registrationSet.add(registration3);
        registrationSet.add(registration4);
        registrationSet.add(registration5);
        registrationSet.add(registration6);*//*


        for (Registration reg : registrationSet){
            if (reg.courseId.equals("1")){
                course1.add(reg.name);
            }
            if (reg.courseId.equals("2")){
                course2.add(reg.name);
            }
            if (reg.courseId.equals("3")){
                course3.add(reg.name);
            }
            if (reg.courseId.equals("4")){
                course4.add(reg.name);
            }
        }

        System.out.println("Students in the course 1 are: "+course1);
        System.out.println("Students in the course 2 are: "+course2);
        System.out.println("Students in the course 3 are: "+course3);
        System.out.println("Students in the course 4 are: "+course4);


    }
}
*/
