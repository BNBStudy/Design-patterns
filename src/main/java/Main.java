import Adapter.Computer;
import Adapter.MemoryCard;
import Adapter.UsbAdapter;
import Factory.CoffeMachine;
import Factory.CoffeeMachineInterface;
import Factory.CoffeeType;
import Singlton.FirstClass;
import Singlton.Logging;
import Singlton.SecondClass;

public class Main {
    public static void main (String[] args) {
        FirstClass f = new FirstClass("FirstClass", "Info");
        SecondClass s = new SecondClass("SecondClass", "info");
        Logging logging = Logging.getLogging();
        logging.logInfo(f);
        logging.logInfo(s);

        CoffeMachine coffeMachine = new CoffeMachine();
        CoffeeMachineInterface coffeeMachineInterface = new CoffeeMachineInterface(coffeMachine);
        coffeeMachineInterface.startMakingCoffee(CoffeeType.AMERICANO);
        coffeeMachineInterface.startMakingCoffee(CoffeeType.ESPRESSO);

        MemoryCard memoryCard = new MemoryCard();
        UsbAdapter usbAdapter = new UsbAdapter(memoryCard);
        Computer computer = new Computer();
        computer.read(usbAdapter);

    }
}
