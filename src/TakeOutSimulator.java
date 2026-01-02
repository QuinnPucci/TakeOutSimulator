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
        try {

        }
    }

}