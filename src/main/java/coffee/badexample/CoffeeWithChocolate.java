package coffee.badexample;

public class CoffeeWithChocolate extends BlackCoffee {
    @Override
    public String getDescription() {
        return "Black Coffee, Chocolate";
    }

    @Override
    public double getCost() {
        return 2.6;
    }
}
