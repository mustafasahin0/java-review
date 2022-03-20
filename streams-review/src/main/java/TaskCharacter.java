import java.util.Arrays;
import java.util.List;

public class TaskCharacter {

    public static void main(String[] args) {


        System.out.println("TASK");
        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");
        words.stream().map(chars -> chars.length()).forEach(System.out::println);
    }
}
