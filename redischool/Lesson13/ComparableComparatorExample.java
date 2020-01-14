package redischool.Lesson13;

import java.util.*;

public class ComparableComparatorExample {

    public static void main(String[] args) {
        //Used comparator by Height as exercise
        //Comparable implemented in the Person Class Exercise 2
        Comparator<Person> com = new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                if (person1.getHeight()>person2.getHeight()){
                    return 1;
                }else if(person1.getHeight()<person2.getHeight()){
                    return -1;
                }else{
                    return 0;
                }
            }
        };

        List<Person> personList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Hi, add some people to the List");
        while(true){
            System.out.println("Please enter a name or press Enter to finish");
            String name;
            name = input.nextLine();
            if (name.equals("")){break;}
            else {
                System.out.println("enter age");
                int age = input.nextInt();
                System.out.println("enter height");
                double height = input.nextDouble();
                personList.add(new Person(name, age, height));
                System.out.println("Person added successfully");
                System.out.println("*********************************");
            }
            input.nextLine();
        }

        //Used Comparable to sort by age
        Collections.sort(personList);
        System.out.println("End of the program");
        System.out.println("=========================================");
        System.out.println("Here the sorted list by age using comparable");
        for (Person p : personList){
            System.out.println(p.toString());
        }

        //Used Comparator to sort by height
        Collections.sort(personList,com);
        System.out.println("*********************************");
        System.out.println("Here the sorted list by height using Comparator");
        for (Person p : personList){
            System.out.println(p.toString());
        }
    }
}
