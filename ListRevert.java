import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListRevert {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<String> listOfNames = new ArrayList<>();
        List<String> listOfNamesReverted = new ArrayList<>();
        int index = 0;


        String name;
        System.out.println("This app will show the list of names and revert them: ");
        System.out.println("Enter a name: ");
        do{

            name = input.nextLine();
            if (name.equals("")){
                break;}
            listOfNames.add(name);
        }
        while(!name.equals(""));
        System.out.println("Here is the List before Reverting it" + listOfNames);
        System.out.println("Here is the reverted List : ");
        for (int i = listOfNames.size()-1; i > -1 ; i--) {
            listOfNamesReverted.add(index, listOfNames.get(i));
            index++;


        }
        System.out.println(listOfNamesReverted);



    }


}

