import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Alan", "Bob", "Alan", "Charlie", "David");

        names.stream()
             .filter(name -> name.startsWith("A"))
             .distinct()
             .map(name -> "Prefix" + name)
             .forEach(System.out::println);

        // no terminal
        // List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // This does NOT execute anything because there's NO terminal operation
        names.stream()
             .filter(name -> {
                 System.out.println("Filtering: " + name);
                 return name.startsWith("A");
             })
             .map(name -> {
                 System.out.println("Mapping: " + name);
                 return name.toUpperCase();
             })
             .forEach(System.out::println);
    }
}
