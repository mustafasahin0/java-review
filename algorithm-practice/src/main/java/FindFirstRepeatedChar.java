import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatedChar {

    public static Character firstRepeatedChar(String str) {
        // Create a HashSet
        Set<Character> chars = new HashSet<>();
        // Iteration return ch if add returns false
        for (Character ch : str.toCharArray()) if (!chars.add(ch)) return ch;
        return null;
    }
}

