import java.util.stream.IntStream;

public class ParallelStreamConversion {
    public static void main(String[] args) {
        // Sequential stream
        IntStream.range(1, 6).forEach(num -> 
            System.out.println(Thread.currentThread().getName() + " - " + num)
        );

        System.out.println("----- Parallel Stream -----");

        // Converting to parallel stream
        IntStream.range(1, 6).parallel().forEach(num -> 
            System.out.println(Thread.currentThread().getName() + " - " + num)
        );
    }
}
