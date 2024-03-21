package coffee.goodexample;

public class Test {

    public static void main(String[] args) {
        // Створюємо базовий об'єкт - чорний кавовий напій
        Coffee blackCoffee = new BlackCoffee();
        System.out.println("Description: " + blackCoffee.getDescription());
        System.out.println("Cost: $" + blackCoffee.getCost());

        // Додаємо молоко до кави
        Coffee coffeeWithMilk = new MilkDecorator(blackCoffee);
        System.out.println("Description: " + coffeeWithMilk.getDescription());
        System.out.println("Cost: $" + coffeeWithMilk.getCost());

        // Додаємо карамель до кави
        Coffee coffeeWithMilkAndCaramel = new CaramelDecorator(coffeeWithMilk);
        System.out.println("Description: " + coffeeWithMilkAndCaramel.getDescription());
        System.out.println("Cost: $" + coffeeWithMilkAndCaramel.getCost());

        // Додаємо шоколад до кави
        Coffee coffeeWithMilkAndCaramelAndChocolate = new ChocolateDecorator(coffeeWithMilkAndCaramel);
        System.out.println("Description: " + coffeeWithMilkAndCaramelAndChocolate.getDescription());
        System.out.println("Cost: $" + coffeeWithMilkAndCaramelAndChocolate.getCost());
    }

}

