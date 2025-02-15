import java.nio.file.*;
import java.io.IOException;
import java.util.stream.*;

public class FileStreamExample {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("example.txt"))
             .forEach(System.out::println);
    }
}