package redischool.Lesson9;

import java.util.ArrayList;
import java.util.List;

public class ArrayStackExercise {

        List<Character> myList = new ArrayList<>(10);
        

        public ArrayStackExercise() {
        }
        public void push(char c) throws ArrayStackException {
            if (myList.size() == 10){
                throw new ArrayStackException ("Not allowed more than 10 elements");
            }
            else{
                myList.add(c);
            }

        }
        public char pop() throws ArrayStackException {
            if (myList.size() == 0){
                throw new ArrayStackException("There is no element to remove");
            }else {
            char myChar = myList.get(myList.size()-1);
            myList.remove( myList.size()-1 );
            return myChar;
        }
        }


        public boolean isEmpty() {
            if (myList.size() == 0){
                return true;
            }
            return false;
        }

        public char top() throws ArrayStackException {
            if (myList.size() == 0){
                throw new ArrayStackException("Wrong command! There is no element in the array!");
            }else {
                return myList.get(myList.size() -1);
            }
        }

        public void printStack() {
            System.out.println("Stack " + myList);
        }


        public static void main(String[] args) throws Exception {
            ArrayStackExercise stack = new ArrayStackExercise();
            stack.push('I');
            stack.push('D');
            stack.push('L');
            stack.push('I');
            stack.push('R');

            stack.printStack();
            System.out.println("Latest character removed is: "+ stack.pop() );
            stack.printStack();
            System.out.println("Element on the top of the stack: "+stack.top());
            System.out.println("Is the stack empty? "+stack.isEmpty());
        }



    private class ArrayStackException extends Exception {
            ArrayStackException (String errorMesagge){
                super(errorMesagge);
            }
    }
}
