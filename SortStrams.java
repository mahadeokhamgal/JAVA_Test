import java.util.Comparator;
import java.util.List;

public class SortStrams {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "Anderson");

        names.stream().sorted().forEach(System.out::println);
        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
    
}
