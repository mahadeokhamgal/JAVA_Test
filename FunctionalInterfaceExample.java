@FunctionalInterface
interface MyFunctionalInterface {
    void greet(); // Single abstract method

    default void sayHello() {
        System.out.println("Hello from default method!");
    }

    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface obj = () -> System.out.println("Hello, Functional Interface!");
        obj.greet(); // Output: Hello, Functional Interface!
        obj.sayHello();
        MyFunctionalInterface.staticMethod();
    }
}
