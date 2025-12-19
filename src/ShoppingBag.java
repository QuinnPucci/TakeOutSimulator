import java.util.HashMap;
import java.util.Map;

public class ShoppingBag<T extends Integer> {
    private Map<T, Integer> shoppingBag = new HashMap<T, Integer>;

    public void addItem(T item) {
        shoppingBag.put(item, shoppingBag.getOrDefault(item, 0) + 1);
    }
    int totalPrice = 0;
    public int getTotalPrice(Map shoppingBag) {
        for(int i: shoppingBag.keySet()) {
            int itemPrice = i;
            int quantity = shoppingBag.get(i);
            int totalPriceForItem = itemPrice * quantity;
            totalPrice = totalPrice + totalPriceForItem;
        }
        return totalPrice;
    }
}