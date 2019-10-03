public class FizzBuzz {


    public static void main(String args[]) {
        for(int i=1; i<=100; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }
            // if number is 35 print Bingo
            else if((i/10)%10 == 5 && i%10 == 3){
                System.out.println("BINGO");
            }
            // if number is 53 print Bingo
            else if((i/10)%10 == 3 && i%10 == 5){
                System.out.println("BINGO");
            }
            else if(i%3 == 0){
                System.out.println("Fizz");
            }
            else if(i%5 == 0){
                System.out.println("Buzz");
            }
            else if(i%10 == 3){
                System.out.println("Fizz");
            }
            else if(i%10 == 5){
                System.out.println("Buzz");
            }
            else if((i/10)%10 == 3 ){
                System.out.println("Fizz");
            }
            else if((i/10)%10 == 5 ){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}