package redischool.Lesson2;

import java.util.Arrays;

//This simple program finds second smallest of a given array
    public class SecondSmallest {
        public static void main(String args[]) {
          int [] elements = {12, 34, 54, 33, 75,0, 0, 6, 88};
          int smallestNumber = Integer.MAX_VALUE;
          int secondSmallestNumber = Integer.MAX_VALUE;

          for(int i=0; i < elements.length; i++ ){
              if(elements[i] < smallestNumber){
                  smallestNumber = elements[i];
              }
              else if(elements[i] > smallestNumber && elements[i] < secondSmallestNumber){
                  secondSmallestNumber = elements[i];
              }
          }
          System.out.println("Second Smallest number of the array "+ Arrays.toString(elements)+ " is "  +secondSmallestNumber);
        }
     }