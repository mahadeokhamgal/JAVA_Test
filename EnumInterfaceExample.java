import java.util.Arrays;

interface Displayable {
    void show();
}

enum Status implements Displayable {
    SUCCESS, FAILURE;

    public void show() {
        System.out.println("Status: " + this);
    }
}

public class EnumInterfaceExample {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Status.values()));
        Status.SUCCESS.show();
    }
}
