import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice");

        List<String> uppercaseNames = names.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        System.out.println(uppercaseNames); // Output: [ALICE, BOB, CHARLIE]

        Set<String> namesSet = names.stream().map(String::toUpperCase).collect(Collectors.toSet());
        System.out.println(namesSet);
    }
}
