package redischool.Lesson16;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CustomerRepository {

    static Set<Customer> customerSet = new HashSet<>();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        Customer matt = new Customer("Matthias","Berg","12.10.1988","Munich","654564");
        Customer ana = new Customer("Ana","Müller","02.10.1968","Munich","564565456");
        Customer berg = new Customer("Berg","Daimler","12.10.1990","Munich","654564");

        customerSet.add(matt);
        customerSet.add(ana);
        customerSet.add(berg);

        for (Customer customer : customerSet){
            if (customer.equals(berg)){
                System.out.println("User data: \n "+ customer);
            }
        }


    }
}
