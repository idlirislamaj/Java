
// This simple program get 8 numbers from user input and find the second smallest from them
import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestWithUserInput {
   public static void main(String args[]) {
       int smallestNumber = Integer.MAX_VALUE;
       int secondSmallestNumber = Integer.MAX_VALUE;
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
       ////////////////////////////////////////


        for(int i=0; i < elements.length; i++ ){
            if(elements[i] < smallestNumber){
                smallestNumber = elements[i];
            }
            else if(elements[i] > smallestNumber && elements[i] < secondSmallestNumber){
                secondSmallestNumber = elements[i];
            }
        }
        System.out.println("Second Smallest number of the array "+ Arrays.toString(elements)+ " is ["  +secondSmallestNumber+"]");
      }
       /////////////////////////////////////
}