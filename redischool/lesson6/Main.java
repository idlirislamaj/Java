package redischool.lesson6;
import java.util.Scanner;
//it maps keys to values / dictionary in c# both have to be objects. key used to retrieve the value.
//hashmap most common map in java
//keyset gets a set of keys
// hashMap builds an array of these mini-lists.
//array:group of same elements+ immutability=
// predefinded size+ access via index starts with 0+ can have many dimensions+ part of java language
//list:dynamic size+ elements can be added and removed+ get method to access using index+ has to be imported:java.util.List
//set:same elements type+ not ordered + non redundant+ dynamic size+ elements can be added and removed+class in Java library.
//map:group of elements of same type+key value pair+key and value may be of same type+ access to element via key(key has to be
//unique+values dont have to be unique+ combinations of set of keys und list of value+

public class Main {
    public static void main(String[] args) {
        String word;
        String translation;
        String answer, answer2;
        int answer3;
        Scanner input = new Scanner(System.in);
        Translator translator = new Translator();
            translator.addTranslation("happy","felice");
            translator.addTranslation("world","terra");
            translator.addTranslation("sky","cielo");
            translator.addTranslation("sea","mare");
            translator.addTranslation("sun","sole");
            translator.addTranslation("sun","diell");


        System.out.println("Welcome to the Translator App.");
        System.out.println("Translate English->Italian");
        System.out.println("Please write a word to translate or 'exit' to leave");

        while (input.hasNext() ){
            word = input.next();
             if(word.toLowerCase().equals("exit")){break;}
             else if (translator.translate(word)== null) {
                System.out.println("Sorry, I do not know that word.");
                System.out.println("Do you want to add it to the Dictionary? y/n");
                answer = input.next();

                if (answer.equalsIgnoreCase("y")) {
                    System.out.println("Please write the translation in italian for the word " + '"' + word + '"');
                    translation = input.next();
                    translator.addTranslation(word, translation);
                    System.out.println("Great! Thanks!");
                    System.out.println("Do you want to search(1) or delete a translation(2)? ");
                    while (input.nextInt() == 2){
                        System.out.println("Please type the english word to modify");
                        answer = input.next();
                        System.out.println("Please type which of the translation you want to delete");
                        answer2 = input.next();
                        translator.removeTranslation(answer,answer2);
                        System.out.println("The translated word "+ answer2+" has been succesfully deleted");
                        System.out.println("Search(1) or delete a translation(2)? ");

                    }System.out.println("Okay! Then search the next word to translate");



                } else {
                    System.out.println("Ok, then search another word :)");

                }

            }

            else{
                System.out.println("in italian is: "+ translator.translate(word));
            }

        }
        System.out.println("Thanks for using Translator");



    }
}
