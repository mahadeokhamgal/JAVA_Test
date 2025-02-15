import java.util.Arrays;
import java.util.List;

public record MapForeach() {
    

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Trying to modify elements using forEach()
        names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
        // System.out.println(names); // Output: [Alice, Bob, Charlie] (No change)
    }

}
