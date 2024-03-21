package coffee.goodexample;

public class ChocolateDecorator implements Coffee {
    private final Coffee coffee;

    public ChocolateDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Chocolate";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.6;
    }
}

