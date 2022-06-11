package Factory;

public class CoffeeFactory {

    public CoffeeService service (CoffeeType coffeeType) {
        CoffeeService coffeeService;
        switch (coffeeType) {
            case AMERICANO: coffeeService = new Americano();
                break;
            case ESPRESSO: coffeeService = new Espresso();
                break;
            default:throw new IllegalArgumentException("Неверный кофе");
        }
        return coffeeService;
    }
}
