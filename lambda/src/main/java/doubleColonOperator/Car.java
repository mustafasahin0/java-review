package doubleColonOperator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {

    private String make;
    private Integer model;

    public Car() {
    }

    public Car(Integer model) {
        this.model = model;
    }

    public Car(String make, Integer model) {
        this.make = make;
        this.model = model;
    }
}
