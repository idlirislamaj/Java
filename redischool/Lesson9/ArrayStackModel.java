package redischool.Lesson9;

import java.util.List;

public class ArrayStackModel {

    public static void main(String[] args) {
        ArrayStackModel myStack = new ArrayStackModel(3);
        try {
            if(!myStack.isEmpty())
                myStack.pop();
            myStack.push('a');
            System.out.println("pop " + myStack.pop());
            myStack.push('b');
            System.out.println("top " + myStack.top());
            myStack.push('c');
            myStack.push('d');

            System.out.println("Result of balance check : " + isBalanced("({[]()}[])"));
            System.out.println("Result of balance check : " + isBalanced("([]()}[])"));
            System.out.println("Result of balance check : " + isBalanced("({[]}[])"));
            System.out.println("Result of balance check : " + isBalanced("({[]("));

        } catch (ArrayStackExceptionModel e) {
            e.printStackTrace();
        }

    }

    private char[] stackArray;
    private int pointer = 0;
    public ArrayStackModel(){}

    public ArrayStackModel(int size){
        stackArray = new char[size];
    }

    public boolean isEmpty(){
        if(pointer == 0)
            return true;
        else
            return false;
    }

    public char top() throws ArrayStackExceptionModel {
        if(pointer == 0)
            throw new ArrayStackExceptionModel("Stack is empty");
        else
            return stackArray[pointer-1];
    }

    public char pop() throws ArrayStackExceptionModel {
        if(pointer == 0)
            throw new ArrayStackExceptionModel("Stack is empty");
        else{
            return stackArray[--pointer];
        }
    }

    public void push(char element) throws ArrayStackExceptionModel {
        if(pointer < stackArray.length){
            stackArray[pointer++] = element;
        }else
            throw new ArrayStackExceptionModel("Stack is full!");
    }

    public static List<Character> opens = List.of ('(', '[', '{');
    public static List<Character> closers = List.of(')', ']', '}');

    public static boolean isBalanced(String expression) {

        ArrayStackModel stack = new ArrayStackModel(10);

        for(int i = 0; i< expression.length(); i++ ){
            char charElement = expression.charAt(i);

            if(opens.contains(charElement)) {
                try {
                    stack.push(charElement);
                } catch (ArrayStackExceptionModel e) {
                    System.out.println ("Stack is too small");
                    e.printStackTrace();
                    System.exit(1);
                }
            }
            else{
                char lastOpened = 0;
                try {
                    lastOpened = stack.pop();
                } catch (ArrayStackExceptionModel e) {
                    return false;
                }

                if(opens.indexOf(lastOpened) != closers.indexOf(charElement)){
                    return false;
                }
            }
        }

        if(stack.isEmpty())
            return true;

        return false;
    }
}
