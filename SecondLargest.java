// This simple program finds second largest number of a given array
public class SecondLargest {
    public static void main(String args[]) {
      int [] elements = {12, 34, 54, 33, 75,0, 7, 6, 88};
      int smallestNumber = elements[0];
      int secondSmallestNumber = elements[0];
      for(int i=0; i < elements.length; i++ ){
          if(smallestNumber < elements[i]){
              secondSmallestNumber = smallestNumber;
              smallestNumber = elements[i];
          }
          else if(secondSmallestNumber < elements[i]){
              secondSmallestNumber = elements[i];
          }
      }
      System.out.println(secondSmallestNumber);
    }
 }