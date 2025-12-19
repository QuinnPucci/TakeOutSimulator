public class Food implements PricedItem<Integer>{
    private String name;
    private String description;
    private int price;

    public Food(name, description, price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public T getPrice(){
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString(){

        System.out.println(name + ": " + description + " Price: " + price);
    }
}