package redischool.Lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorsOfN {
    static List<Integer> primeFactorsList = new ArrayList<>();
    // Method used to calculate prime factors
    public static void primeFactors(int number){
        if (number > 1){
            for (int i = 2; i <=number ; i++) {
                while (number%i == 0){
                    primeFactorsList.add(i);
                    number /= i;
                }
            }
        }
        System.out.println("Calculated prime factors "+primeFactorsList);
    }

    public static void main(String[] args) {

        System.out.println("Enter a number to find his prime factors");
        Scanner input = new Scanner(System.in);
        primeFactors(input.nextInt());

    }
}
