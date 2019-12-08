package redischool.Lesson11;

public class WeekdaysTest {
    enum Days{
        MONDAYS("are bad."),
        MIDWEEK("days are so-so."),
        FRIDAYS("are better."),
        WEEKENDS("are best.");
       private String message;


        Days(String msg){
            this.message = msg;
        }

        String getMessage(){
            return message;
        }

    }

    public static void main(String[] args) {
        for (Days day : Days.values()){
            if (day.equals(Days.WEEKENDS)){
                System.out.printf("%s %s\n", day,day.getMessage());
            }
            System.out.printf("%s %s\n", day,day.getMessage());
        }

    }
}
