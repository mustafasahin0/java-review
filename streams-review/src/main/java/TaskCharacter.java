import java.util.Arrays;
import java.util.List;

public class TaskCharacter {

    public static void main(String[] args) {

    //Given a list of words, print the number of characters for each word.

        System.out.println("TASK");
        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");
        words.stream().map(chars -> chars.length()).forEach(System.out::println);
    }
}
