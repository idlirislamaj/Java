package redischool.Lesson13;

import java.time.*;
import java.util.Scanner;

public class LocalDateExercise {
    /*Write a program which asks the user for a date in the past
    and outputs the number of seconds which have elapsed between
    the beginning of the date on the entered day and the current time.*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, This program calculate how many seconds have been elapsed since you were born");
        while (true) {
            System.out.println("Enter the Year of birth");
            int year = in.nextInt();
            System.out.println("Enter the Month of birth");
            int month = in.nextInt();
            System.out.println("Enter which day of the month");
            int day = in.nextInt();
            LocalDateTime today = LocalDateTime.now();
            LocalDate birthday = LocalDate.of(year,month,day);
            Duration duration = Duration.between(birthday.atStartOfDay(),today);
            System.out.println("Born on: "+ birthday.getDayOfMonth()+" "+birthday.getMonth() +" "+birthday.getYear()+
                    " and the elapsed seconds are: "+ duration.getSeconds());
            System.out.println("Want to add another birthday? y/n");
            String flag = in.next();
            if (flag.equals("n")){
                break;
            }
        }

    }
}
