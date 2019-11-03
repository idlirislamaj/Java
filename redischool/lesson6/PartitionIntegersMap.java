package redischool.lesson6;

import java.util.*;

public class PartitionIntegersMap {
    static Map<Integer, List<Integer>> mappingIntegers (List<Integer> myList, int n){
        Map<Integer, List<Integer>> myDictionary = new HashMap<>();
        for (Integer element:myList){
            if (myDictionary.containsKey(element%n) == false){
                List<Integer> list = new ArrayList<>();
                myDictionary.put(element%n, list);
            }
            List<Integer> list = myDictionary.get(element%n);
            list.add(element);
        }


        return myDictionary;
    }

    public static void main(String[] args) {
        List<Integer> anyList = List.of(2, 5, 3,50,48,96);
        Map<Integer, List<Integer>> test = mappingIntegers(anyList,3);
        System.out.println(test);
    }
}