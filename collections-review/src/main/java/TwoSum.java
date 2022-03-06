import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] myArray = {2, 7, 9, 11};

        System.out.println(Arrays.toString(twoSum(myArray, 9)));
        System.out.println("Optimal Solution .........");
        System.out.println(Arrays.toString(twoSum2(myArray, 9)));
    }

    public static int[] twoSum(int[] array, int target) {

        for (int i = 0; i < array.length - 1; i++) {  //n
            for (int j = i + 1; j < array.length; j++) { //n
                if (array[i] + array[j] == target) return new int[]{i, j};
            }
        }
        return new int[]{};
    }

    // n*n if one pass is possible?
    //my optimal Solution 0(n)
    public static int[] twoSum2(int[] array, int target) {
        // Create HashMap
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate over the array.
        // If a potential match exist return that indices else put the array value and index to map

        for (int i = 0; i < array.length; i++) {
            int potentialMatch = target - array[i];
            if (map.containsKey(potentialMatch)) return new int[]{i, map.get(potentialMatch)};
            else map.put(array[i], i);
        }
        return new int[]{};
    }
}