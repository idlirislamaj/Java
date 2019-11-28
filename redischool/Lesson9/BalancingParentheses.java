package redischool.Lesson9;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancingParentheses {

    public static void main(String[] args) {

        String braces = "{}({}[])";
        if (isBalanced((braces))){
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }


    }


    public static boolean isBalanced(String brackets){

        Map<Character , Character> braces = new HashMap<>();
        braces.put('(' , ')');
        braces.put('[' , ']');
        braces.put('{' , '}');


        if (brackets.length() % 2 != 0){
            return false;
        }


        Stack<Character> halfBraces = new Stack<>();
        for (char ch:brackets.toCharArray()){
            if (braces.containsKey(ch)){
                halfBraces.push(braces.get((ch)));

            }

            else if (halfBraces.isEmpty() || ch != halfBraces.pop()){
                return false;
            }
        }
        return halfBraces.isEmpty();

    }

}
