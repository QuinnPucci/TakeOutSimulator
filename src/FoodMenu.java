import java.util.ArrayList;
import java.util.List;

public class FoodMenu {

    private List<Food> menu = new ArrayList<>;

    // use food constructor to create 3 food items
    Food taco = new Food ("Taco", "its a taco", 2);
    Food pizza = new Food ("Pizza", "its pizza", 10);
    Food pineapple = new Food ("Pineapple", "SPIKY", 1000);

    public FoodMenu(){
        menu.add(taco);
        menu.add(pizza);
        menu.add(pineapple);
    }
}