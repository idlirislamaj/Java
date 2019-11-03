package redischool.Lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<String> wordsArray = new ArrayList<>();
        List<String> duplicatedWordsArray = new ArrayList<>();
        System.out.println("Enter words to the array");
        Scanner input = new Scanner(System.in);
        String words;

        do {
            words = input.nextLine();
            if (wordsArray.contains(words)){
                duplicatedWordsArray.add(words);
            } else if(words.equals("")){
                    break;
            }
            else {
                wordsArray.add(words);

            }
        }while (!words.equals(""));

        System.out.println("Here are the elements entered to the array "+wordsArray);
        System.out.println("Here are the duplicates found "+duplicatedWordsArray);


    }
}
