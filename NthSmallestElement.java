import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NthSmallestElement {

    public static void main(String[] args) {

        List<Integer> myList = List.of(10,15,40,50,60,70,30,5,8,24);
        Set<Integer> mySet = new HashSet<>(myList);


        System.out.println(nthSmallestElement(mySet, 7));

    }


    public static Integer nthSmallestElement(Set<Integer> mySet, int nth){

        Set<Integer> treeSet = new TreeSet<>(mySet);
        int i = 0;
        for (Integer myInt : treeSet){
            i++;
            if (i == nth){
                return myInt;
            }

            else if(treeSet.size()< nth){
                return Integer.MAX_VALUE;
            }
        }
        return null;
    }
}
