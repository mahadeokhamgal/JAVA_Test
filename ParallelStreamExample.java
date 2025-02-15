import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Using parallel stream
        names.parallelStream().forEach(name -> 
            System.out.println(Thread.currentThread().getName() + " - " + name)
        );
    }
}
