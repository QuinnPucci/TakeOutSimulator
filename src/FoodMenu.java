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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Menu:\n");

        for (int i = 0; i < menu.size(); i++){
            sb.append(i)
                    .append(". ")
                    .append(menu.get(i))
                    .append("\n");
        }
        return sb.toString();
    }
}