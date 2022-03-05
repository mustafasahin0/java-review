import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        //1. create a set
        Set<Student> mySet = new HashSet<>();

        //2. add element
        mySet.add(new Student(7, "Mustafa"));
        mySet.add(new Student(8, "Juh"));
        mySet.add(new Student(9, "Kop"));
        mySet.add(new Student(9, "Kop"));


        System.out.println(mySet);

        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        System.out.println(numSet);
        System.out.println(numSet.add(2));

        System.out.println(firstRepeatingChar("Jva Delopr"));

    }

    public static Character firstRepeatingChar(String str){

        // Create a HashSet
        Set<Character> chars = new HashSet<>();
        // Iteration return ch if add returns false
        for(Character ch : str.toCharArray()) if(!chars.add(ch)) return ch;
        return null;

    }
}
