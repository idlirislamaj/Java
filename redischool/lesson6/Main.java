package redischool.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word;
        String translation;
        String answer;
        Scanner input = new Scanner(System.in);
        Translator translator = new Translator();

        System.out.println("Welcome to the Translator App.");
        System.out.println("Translate English->Italian");
        System.out.println("Please insert a word to translate");


        while (input.hasNext()){
            word = input.nextLine();
            if (translator.translate(word) == ""){
                System.out.println("Sorry, I do not know that word.");
                System.out.println("Do you want to add it to the Dictionary? y/n");
                answer = input.nextLine();

                if (answer.equalsIgnoreCase("y")){
                    System.out.println("Please write the translation in italian for the word "+'"'+ word+'"');
                    translation = input.nextLine();
                    translator.addTranslation(word, translation);
                    System.out.println("Great! Thanks!");
                    System.out.println("Search next word to translate");

                }else{
                    System.out.println("Goodbye");
                    break;
                }

            }else{
                System.out.println("in italian is: "+ translator.translate(word));
            }

        }

    }
}
