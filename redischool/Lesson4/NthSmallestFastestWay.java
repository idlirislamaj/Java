package redischool.Lesson4;

import java.util.*;


public class NthSmallestFastestWay {



        public static void main(String[] args) {
            List<Integer> myList = List.of(12,1,44,55,76,5,22);
            Set<Integer> mySet = new HashSet<>(myList);
            System.out.println(nthSmallestElement(mySet, 6));
        }



        public static Integer nthSmallestElement(Set<Integer> mySet, int n) {
            int pivot = getAnyElement(mySet);
            Set<Integer> smallerElements = new HashSet<>();
            Set<Integer> biggerElements = new HashSet<>();
            for (int element : mySet) {
                if (element < pivot) {
                    smallerElements.add(element);
                } else if (element > pivot) {
                    biggerElements.add(element);
                }
            }
            if (n <= smallerElements.size()) {
                return nthSmallestElement(smallerElements, n);
            } else if (n == smallerElements.size() + 1) {
                return pivot;
            } else {
                return nthSmallestElement(biggerElements, n - (smallerElements.size() + 1));
            }
        }

        private static int getAnyElement(Set<Integer> mySet) {
            for (int element : mySet) {
                return element;
            }
            return Integer.MAX_VALUE;
        }
    }

