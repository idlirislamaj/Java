package redischool.Lesson14;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {

    public static List<Integer> squareMethod(List<Integer> myIntegers){
        List<Integer> newList = new ArrayList<>();
        for(int i = 0; i<myIntegers.size(); i++){
            newList.add(myIntegers.get(i)*myIntegers.get(i));
        }
        return newList;
    }

    public static List<Integer> countChar(List<String> myString){
        List<Integer> lengths = new ArrayList<>();
        for (String word:myString ){
            lengths.add(word.length());
        }
        return lengths;
    }


    public static void main(String[] args) {

        List<Integer> myList = List.of(1,2,3,4,5,6,7);

        System.out.println(squareMethod(myList));


        List<String> myStrings = List.of("Happy","new","Year");
        System.out.println(countChar(myStrings));

        myList.forEach(System.out::println);


    }
}
