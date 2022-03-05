import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharInString {

    public static void main(String[] args) {

        findNonRepeatedCharNoCollection("mumtfas");

    }

    //Without Collections
    public static void findNonRepeatedCharNoCollection(String str) {

        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }

    public static void findNonRepeatedCharWithCollection(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for(Map.Entry<Character, Integer> entrySet: map.entrySet() ){
            if(entrySet.getValue()== 1){
                System.out.println(entrySet.getKey());
                break;
            }
        }
    }

}
