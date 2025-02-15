import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - $" + salary;
    }
}

public class SortObjects {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", 50000),
                new Employee("Bob", 70000),
                new Employee("Charlie", 60000));

        // Sorting by salary (ascending order)
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(emp -> emp.salary))
                .collect(Collectors.toList());

        System.out.println(sortedEmployees);
        // Output: [Alice - $50000.0, Charlie - $60000.0, Bob - $70000.0]
    }
}
