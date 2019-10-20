import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PartialSumLists {

    public static void main(String[] args) {

        List<Integer> firstList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int temp;
        System.out.println("Please enter 10 elements of the array ");

        for (int i = 0; i <10 ; i++) {
            firstList.add(i, input.nextInt());
        }
        System.out.println("Here is the entered array "+firstList);


        System.out.println("Here is the partial sums of the array "+ partialSum(firstList));
    }



    public static List<Integer> partialSum(List<Integer> array){
        int sum = array.get(0);
        List<Integer> secondList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (i == 0){
                secondList.add(0, array.get(0));
            }
            else {
                sum = sum + array.get(i);
                secondList.add(i,  sum);
            }
        }
        return secondList;
    }
}
