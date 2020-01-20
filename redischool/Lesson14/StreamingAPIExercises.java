package redischool.Lesson14;

import com.google.common.base.Stopwatch;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StreamingAPIExercises {
/*
    Write two versions of the same method:

    Take a list of double as input, toss out the entries which are between -1.0 and 1.0, and return
    the sum of the squares of the remaining numbers as output.

    Write the first version with a normal for-loop and the second version using the streaming API.
*/



    public static double sumAndSquare(List<Double> myList){
        double sum = 0;
        for (Double num : myList){
            if (num < -1 || num > 1){
                sum = sum + num*num;
            }

        }

        return sum;
    }

    public static void main(String[] args) {
        List<Double> doubles = List.of(1.0, 2.0, -0.75, 4.00, 0.77, 0.55, 12.00, 5.00,1.0, 2.0, -0.75, 4.00, 0.77, 0.55, 12.00, 5.00,1.0, 2.0, -0.75, 4.00, 0.77, 0.55, 12.00, 5.00,1.0, 2.0, -0.75, 4.00, 0.77, 0.55, 12.00, 5.00,1.0, 2.0, -0.75, 4.00, 0.77, 0.55, 12.00, 5.00,1.0, 2.0, -0.75, 4.00, 0.77, 0.55, 12.00, 5.00);



        //Using normal for-loop
        Stopwatch forLoopStopWatch = Stopwatch.createStarted();
        System.out.println("Using for-loop "+sumAndSquare(doubles));
        forLoopStopWatch.stop();
        long forLoopDuration = forLoopStopWatch.elapsed(TimeUnit.MICROSECONDS);
        System.out.println("Elapsed time: " + forLoopDuration + "μs");
        System.out.println("*****************************");


        //using Stream API
        Stopwatch streamAPIStopWatch = Stopwatch.createStarted();
        System.out.println("Using Stream API "+
                doubles.stream()
                        .filter(x-> x>1 || x<-1)
                     //   .reduce(0, (x,y)-> x+y) same as sum()
                        .mapToDouble(x-> x*x).sum()

        );
        streamAPIStopWatch.stop();
        long streamAPIduration = streamAPIStopWatch.elapsed(TimeUnit.MICROSECONDS);
        System.out.println("Elapsed time: " + streamAPIduration + "μs");
    }
}
