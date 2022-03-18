package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(User.builder().firstName("Mike").lastName("Smith").age(35).build());
        users.add(User.builder().firstName("Tom").lastName("Hanks").age(55).build());
        users.add(User.builder().firstName("Amy").lastName("Evan").age(35).build());
        users.add(User.builder().firstName("Emma").lastName("Pellard").age(35).build());


        //Print all elements in the list
        printName(users, p-> true );
        //Print all users that last name start with E
        printName(users, p -> p.getFirstName().startsWith("E"));

    }

    public static void printName(List<User> userList, Predicate<User> p){
        for (User user : userList) {
            if(p.test(user)){
                System.out.println(user.toString());
            }
        }
    }


}

