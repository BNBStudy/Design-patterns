package Adapter;

public class MemoryCard implements SomeDifferentUSB {
    @Override
    public void read() {
        System.out.println("Подключаюсь по другому типу интерфеса USB");
    }
}
