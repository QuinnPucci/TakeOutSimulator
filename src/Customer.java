public class Customer{
    private String name;
    private int money;

    public Customer(name, money){
        this.money = money;
        this.name = name;
    }

    public void setName(name){
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }
}