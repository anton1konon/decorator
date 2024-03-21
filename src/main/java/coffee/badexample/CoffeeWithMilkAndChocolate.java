package coffee.badexample;

public class CoffeeWithMilkAndChocolate extends BlackCoffee {
    @Override
    public String getDescription() {
        return "Black Coffee, Milk, Chocolate";
    }

    @Override
    public double getCost() {
        return 3.6;
    }
}
