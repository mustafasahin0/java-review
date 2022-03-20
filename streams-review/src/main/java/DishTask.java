import java.util.Comparator;

public class DishTask {

    public static void main(String[] args) {
        //Print all dish's name that has less than 400 calories
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .map(Dish::getName)
                .forEach(System.out::println);

        //Print the length of the name of each dish
        DishData.getAll().stream()
                .map(i -> i.getName().length())
                .forEach(System.out::println);

        //Print there high caloric Dish name (>300);
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        //Print all Dish name that are below 400 calarioes in sorter
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);

    }
}
