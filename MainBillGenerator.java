@SuppressWarnings("all")
public class MainBillGenerator {
    public static void main(String[] args) {
        // Pizza basePizza = new Pizza(true);
        // basePizza.addExtraCheese();
        // basePizza.addExtraToppings();
        // basePizza.takeAway();
        // basePizza.addExtraToppings();
        // basePizza.takeAway();
        // basePizza.getBill();
        DeluxPizza dp = new DeluxPizza(false);
        dp.takeAway();
        dp.getBill();
    }
}