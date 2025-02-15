// Generic class with type parameter <T>
class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();  // Integer type
        intBox.setValue(10);
        System.out.println(intBox.getValue());  // Output: 10

        Box<String> strBox = new Box<>();  // String type
        strBox.setValue("Hello");
        System.out.println(strBox.getValue());  // Output: Hello
    }
}
