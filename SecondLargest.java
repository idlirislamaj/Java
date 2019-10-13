import java.util.Arrays;
// This simple program finds second largest number of a given array
public class SecondLargest {
    public static void main(String args[]) {
        int [] elements = {12, 34, 54, 33, 75,0, 0, 6, 88, 77 ,12, 559, 88, 559};
        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for(int i=0; i < elements.length; i++ ){
            if(elements[i] > largestNumber){
                secondLargestNumber = largestNumber;
                largestNumber = elements[i];
            }
            else if(elements[i] > secondLargestNumber && elements[i] < largestNumber){
                secondLargestNumber = elements[i];
            }
        }
        System.out.println("Second Smallest number of the array "+ Arrays.toString(elements)+ " is "  +secondLargestNumber);
      }
   }
