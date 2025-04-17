package Collection.set;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author ScholarChen20
 * @version 0.1
 */
@SuppressWarnings({"all"})
public class LinkHashSetTest1 {
    public static void main(String[] args) {

        Set set = new LinkedHashSet();
        set.add(new Car("Aotuo",120000));
        set.add(new Car("Dazhong",320000));
        set.add(new Car("Baomao",320000));
        set.add(new Car("Benci",330000));
        set.add(new Car("Aotuo",120000));
        System.out.println(set);

    }
}

class Car{
    private String color;
    private int price;

    public Car(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return price == car.price && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
