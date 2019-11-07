package redischool.Lesson7Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
     public static void main(String[] args) {

         List<Shapes> shape = new ArrayList<>();
         shape.add(new Rectangle(10,5));
         shape.add(new Circle(12));
         for (Shapes item: shape){
             System.out.println(item); // Return toString method with the name of the Class
             System.out.println(item.area());
         }

        }

    }

