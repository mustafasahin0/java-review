import java.lang.reflect.AccessibleObject;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));
        
//        List<Apple> heavyApple = filterApples(inventory, new AppleHeavyPredicate());
//        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());

        List<Apple> greenApple = filterApple(inventory, apple -> apple.getColor().equals(Color.GREEN));
        List<Apple> heavyApple = filterApple(inventory, apple -> apple.getWeight()>200);


       System.out.println(heavyApple);
       System.out.println(greenApple);

        prettyPrintApple(inventory, new AppleColorPrint());
        prettyPrintApple(inventory, new AppleWeightPrint());
    }

//    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
//
//        List<Apple> result = new ArrayList<>();
//
//        for(Apple apple : inventory){
//            if(applePredicate.test(apple)){
//                result.add(apple);
//            }
//        }
//
//        return result;
//    }

    private static List<Apple> filterApple(List<Apple> inventory, Predicate<Apple> a){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if(a.test(apple)){
            result.add(apple);
            }
        }
        return result;
    }

    private static void prettyPrintApple(List<Apple> inventory, ApplePrettyPrint applePrettyPrint){
        for (Apple apple : inventory){
            String output = applePrettyPrint.print(apple);
            System.out.println(output);
        }
    }

}
