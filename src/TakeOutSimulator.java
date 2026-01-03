import java.util.Scanner;

public class TakeOutSimulator{
    private Customer customer;
    private FoodMenu menu;
    private Scanner input;

    public TakeOutSimulator(Customer customer, FoodMenu menu, Scanner input){
        this.customer = customer;
        this.menu = menu;
        this.input = input;
    }

    private <T> T getResponse(String userInputPrompt, UserInputRetriever<T> userInputRetriever){
        while (true) {
            try {
                System.out.println(userInputPrompt);
                String usrInput = input.nextLine();

                int value = Integer.parseInt(userInput);

                return userInputRetriever.produceOutput(value);
            }
            catch (NumberFormatException e) {
                System.out.println("Input needs to be an `int` type.")
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage())
            }
        }
    }

    boolean shouldSimulate() {
        String userPrompt = " type '1' to proceed with simulation, '0' to exit"
        UserInputRetriever<Boolean> retriever = new UserInputRetriever<Boolean>() {
            @Override
            public Boolean produceOutput(int selection) throws IllegalArgumentException{
                if (selection == 0) {
                    return false;
                }

                if (selection == 1) {
                    Food lowestCostFood = menu.getLowestCostFood();
                    return customer.getMoney() >= lowestCostFood.getPrice();
                }

                throw new IllegalArgumentException("Selection must be 0 or 1.");
            }
        }
        return getResponse(userPrompt, retriever);
    }

    Food getMenuSelection(){
        String userPrompt = "Choose a menu item: "

        UserInputRetriever<Integer> retriever = new UserInputRetriever<Integer>() {
            @Override
            public Food produceOutput(int selection) throws IllegalArgumentException{

            }
        }
    }

}