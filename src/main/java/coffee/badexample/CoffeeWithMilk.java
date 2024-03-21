package coffee.badexample;

public class CoffeeWithMilk extends BlackCoffee {
    @Override
    public String getDescription() {
        return "Black Coffee, Milk";
    }

    @Override
    public double getCost() {
        return 3;
    }
}
