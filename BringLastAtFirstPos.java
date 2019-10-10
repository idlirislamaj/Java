import java.util.Arrays;
public class BringLastAtFirstPos {
  public static void main(String args[]) {
    //Creating the array 
    int [] array = {12, 34, 54, 33, 75,0, 7, 6, 88};
    System.out.println("Before change  "+Arrays.toString(array));
    // copy array, add an additional element 0 at the end and then copy to array2
    int[] array2 = Arrays.copyOf(array, array.length + 1);
    System.out.println("Step 1         "+Arrays.toString(array2));
    //Copy last element of the array to the first position at array2
    array2[0] = array[array.length-1];
    //Copy array at array2 starting from position 1 of the array2
    //System.arraycopy(src, srcPos, dest, destPos, length);
    System.arraycopy(array,   0,   array2,   1, array.length);
    System.out.println("Step 2         "+Arrays.toString(array2));
    //Copy array2 at array3 with the length of array, this way will cut the last element added before
    int[] array3 = Arrays.copyOf(array2, array.length);
    System.out.println("After Swap     "+Arrays.toString(array3));
  }
}