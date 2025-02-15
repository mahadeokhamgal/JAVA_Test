import java.lang.reflect.Method;
import java.util.Arrays;

class Example {
    public void show() {}
    private void secret() {}
}

public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1️⃣ Using .class
        Class<?> cls1 = Example.class;
        Method[] methods = cls1.getDeclaredMethods();

        // 2️⃣ Using getClass() on an object
        Example obj = new Example();
        Class<?> cls2 = obj.getClass();

        // 3️⃣ Using Class.forName()
        Class<?> cls3 = Class.forName("Example");

        System.out.println(cls1.getName()); // Output: Example
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
        }
    }
}
