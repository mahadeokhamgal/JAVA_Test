import java.io.*;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try (// try {
            FileReader file = new FileReader("non_existing_file.txt")) {
                BufferedReader br = new BufferedReader(file);
                System.out.println(br.readLine());
      // } catch (IOException e) {
                // System.out.println("File not found! " + e.getMessage());
      // }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    }
}
