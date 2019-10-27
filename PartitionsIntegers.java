import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PartitionsIntegers {

    static List<Set<Integer>> partitionInteger(List<Integer> myList, int n){
        List<Set<Integer>> finalList = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            Set<Integer> set = new HashSet<>();
            finalList.add(set);
        }
        for (int number:myList){
            finalList.get(number % n).add(number);
        }
        return finalList;
    }

    public static void main(String[] args) {
        List<Integer> anyList = List.of(2, 5, 3, 7);
        List<Set<Integer>> test = partitionInteger(anyList,3);
        System.out.println(test);
    }
}
