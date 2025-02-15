import java.io.*;

class Person implements Serializable {
    String name;
    transient int age;  // This field won't be serialized

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Transient {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Alice", 30);

        // Serialize object
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
        oos.writeObject(person);
        oos.close();

        // Deserialize object
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
        Person deserializedPerson = (Person) ois.readObject();
        ois.close();

        System.out.println("Name: " + deserializedPerson.name); // Alice
        System.out.println("Age: " + deserializedPerson.age);   // 0 (default value)
    }
}

