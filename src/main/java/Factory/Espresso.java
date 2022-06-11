package Factory;

public class Espresso implements CoffeeService{
    @Override
    public int getCoffeeTimeMaking() {
        return 2;
    }
}
