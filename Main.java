import java.io.*;

class Person implements Serializable {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        // Person person = new Person("Alice", 30);

        // // Serialize object to a file
        // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
        // oos.writeObject(person);
        // oos.close();

        // System.out.println("Serialization Done!");
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person person = (Person) ois.readObject();
            System.out.println("Name: " + person.name);
            System.out.println("Age: " + person.age);
        }
    }
}
