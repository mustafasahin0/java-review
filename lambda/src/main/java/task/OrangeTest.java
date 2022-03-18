package task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(100).color(Color.RED).build());
        inventory.add(Orange.builder().weight(500).color(Color.RED).build());
        inventory.add(Orange.builder().weight(300).color(Color.GREEN).build());

        OrangeFormatter simpleFormatter = (Orange orange) -> "An Orange of " + orange.getWeight() + "g";
        prettyPrintOrange(inventory, orange -> "An Orange of " + orange.getWeight() + "g");

        //prettyPrintOrange(inventory, (Orange orange) -> "An Orange of " + orange.getWeight() + "g");
        System.out.println("************");
        prettyPrintOrange(inventory, orange -> {
            String characteristic = orange.getWeight() > 150 ? "heavy" : "light";
            return "A " + characteristic + " " + orange.getColor() + " orange";
        });
        System.out.println("*************");

        OrangeFormatter fancyFormatter = orange -> {
            String characteristic = orange.getWeight() > 150 ? "heavy" : "light";
            return "A " + characteristic + " " + orange.getColor() + " orange";
        };


    }

//    public static void prettyPrintApple(List<Orange> inventory, OrangeFormatter orangeFormatter){
//
//        for (Orange orange : inventory){
//            String output = orangeFormatter.accept(orange);
//            System.out.println(output);
//        }
//    }

    public static void prettyPrintOrange(List<Orange> inventory, Function<Orange, String> o) {

        for (Orange orange : inventory) {
            String output = o.apply(orange);
            System.out.println(output);
        }
    }


}
