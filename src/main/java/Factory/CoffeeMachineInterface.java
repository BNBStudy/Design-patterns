package Factory;

public class CoffeeMachineInterface {

    private final CoffeMachine coffeMachine;

    public CoffeeMachineInterface(CoffeMachine coffeMachine) {
        this.coffeMachine = coffeMachine;
    }

    public void startMakingCoffee(CoffeeType coffeeType) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        CoffeeService coffeeService = coffeeFactory.service(coffeeType);
        System.out.println("Кофе выбран");
        getTime(coffeeService.getCoffeeTimeMaking());
        coffeMachine.maikingCofee(coffeeService);

    }

    private void getTime (int time) {
        System.out.println("Время приготовления:" + " " + time + " " + "минута");
    }
}
