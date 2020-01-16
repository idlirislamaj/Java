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
        String finishInput = "y";
        while (finishInput.equals("y")) {
            System.out.println("Enter the Year of birth");
            int year = in.nextInt();
            System.out.println("Enter the Month of birth");
            int month = in.nextInt();
            System.out.println("Enter which day of the month");
            int day = in.nextInt();
            LocalDateTime now = LocalDateTime.now();
            LocalDate birthday = LocalDate.of(year,month,day);
            Duration duration = Duration.between(birthday.atStartOfDay(),now);
            System.out.println("Born on: "+ birthday.getDayOfMonth()+" "+birthday.getMonth() +" "+birthday.getYear()+
                    " and the elapsed seconds are: "+ duration.getSeconds());
            System.out.println("Want to add another birthday? y/n");
            finishInput = in.next();
        }

    }
}
