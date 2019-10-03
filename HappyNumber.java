public class HappyNumber {

    public static void main(String[] args) {

        for(int num = 10; num <= 20; num++){

            int result = num;

            while(result != 1 && result != 4){
                result = HappyNum(result);
            }
            if (result == 1){
                System.out.println(num + " is a Happy Number");
            }
            else if (result == 4){
                System.out.println(num + " is Not Happy Number");
            }

        }}


    public static int HappyNum(int num){
        int rem = 0;
        int sum = 0;

        //Square digits of the number until num is 0 then return sum
        while(num>0){
            rem =num%10;
            sum = sum+(rem*rem);
            num = num/10;
        }
        return sum;
    }
}


