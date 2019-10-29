package redischool.lesson5;


import com.google.common.base.Stopwatch;

        import java.util.*;
import java.util.concurrent.TimeUnit;

    public class NthSmallestElementComparisonStopWatch {
        public static void main(String[] args) {
            Set<Long> elements = randomSet(100);

            Stopwatch ourAlgorithmStopwatch = Stopwatch.createStarted();
            nthSmallestElement(elements, 5);
            long ourAlgorithmDuration = ourAlgorithmStopwatch.elapsed(TimeUnit.MICROSECONDS);
            System.out.println("Our algorithm's time: " + ourAlgorithmDuration + "μs");

            Stopwatch treeSetAlgorithmStopwatch = Stopwatch.createStarted();
            nthSmallestElementTreeSet(elements, 5);
            long treeSetAlgorithmDuration = treeSetAlgorithmStopwatch.elapsed(TimeUnit.MICROSECONDS);
            System.out.println("TreeSet algorithm's time: " + treeSetAlgorithmDuration + "μs");

            Stopwatch sortingAlgorithmStopwatch = Stopwatch.createStarted();
            nthSmallestElementSorting(elements, 5);
            long sortingAlgorithmDuration = sortingAlgorithmStopwatch.elapsed(TimeUnit.MICROSECONDS);
            System.out.println("Sorting algorithm's time: " + sortingAlgorithmDuration + "μs");

            Stopwatch ourAlgorithmUsingListStopwatch = Stopwatch.createStarted();
            nthSmallestElementUsingList(List.copyOf(elements), 5);
            long ourAlgorithmUsingListDuration = ourAlgorithmUsingListStopwatch.elapsed(TimeUnit.MICROSECONDS);
            System.out.println("Our algorithm using list's time: " + ourAlgorithmUsingListDuration + "μs");
        }

        private static Set<Long> randomSet(int size) {
            Random random = new Random();
            Set<Long> result = new HashSet<>();
            for (int i = 0; i < size; ++i) {
                result.add(random.nextLong());
            }
            return result;
        }

        private static long nthSmallestElement(Set<Long> elements, int n) {
            long pivot = getAnyElement(elements);
            Set<Long> smallerElements = new HashSet<>();
            Set<Long> biggerElements = new HashSet<>();
            for (long element : elements) {
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

        private static long getAnyElement(Set<Long> elements) {
            for (long element : elements) {
                return element;
            }
            return Integer.MAX_VALUE;
        }

        private static long nthSmallestElementTreeSet(Set<Long> elements, int n) {
            Set<Long> sortedSet = new TreeSet<>(elements);
            for (long element : sortedSet) {
                if (n == 1) {
                    return element;
                }
                n = n - 1;
            }
            return Integer.MAX_VALUE;
        }

        private static long nthSmallestElementSorting(Set<Long> elements, int n) {
            List<Long> sortedList = new ArrayList<>(elements);
            Collections.sort(sortedList);
            if (n <= elements.size()) {
                return sortedList.get(n - 1);
            } else {
                return Integer.MAX_VALUE;
            }
        }

        private static long nthSmallestElementUsingList(List<Long> elements, int n) {
            if (elements.isEmpty()) {
                return Integer.MAX_VALUE;
            }
            long pivot = elements.get(0);
            List<Long> smallerElements = new ArrayList<>();
            List<Long> biggerElements = new ArrayList<>();
            for (long element : elements) {
                if (element < pivot) {
                    smallerElements.add(element);
                } else if (element > pivot) {
                    biggerElements.add(element);
                }
            }
            if (n <= smallerElements.size()) {
                return nthSmallestElementUsingList(smallerElements, n);
            } else if (n == smallerElements.size() + 1) {
                return pivot;
            } else {
                return nthSmallestElementUsingList(biggerElements, n - (smallerElements.size() + 1));
            }
        }
    }

