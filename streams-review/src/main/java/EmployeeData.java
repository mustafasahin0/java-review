import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll() {
        return Stream.of(
                new Employee(100, "Mike", "mike@abc.com", Arrays.asList("2012494178", "2023034547")),
                new Employee(102, "Ozzy", "ozzy@abc.com", Arrays.asList("1012494478", "9023034547")),
                new Employee(103, "Peter", "peter@abc.com", Arrays.asList("5012494178", "7023034547"))
        );
    }
}
