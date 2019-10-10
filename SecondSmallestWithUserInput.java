// This simple program get 8 numbers from user input and find the second smallest from them
import java.util.Scanner;

public class SecondSmallestWithUserInput {
   public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
       int[] elements = new int[8];
       System.out.println("Hi! This app will find the second smallest number of an array of "  +elements.length+  " elements");
       System.out.println("Let’s get started!");
       for(int i=0; i< elements.length; i++){
           int num = i+1;
           System.out.println("Please enter number "+ num +" to the array");
           elements[i] = input.nextInt();
       }
       input.close();
     int smallestNumber = elements[0];
     int secondSmallestNumber = elements[0];
     for(int i=0; i < elements.length; i++ ){
         if(smallestNumber > elements[i]){
             secondSmallestNumber = smallestNumber;
             smallestNumber = elements[i];
         }
         else if(secondSmallestNumber > elements[i]){
             secondSmallestNumber = elements[i];
         }
     }
     System.out.println("The second largest number from the numbers you entered is: " + secondSmallestNumber);
   }
}