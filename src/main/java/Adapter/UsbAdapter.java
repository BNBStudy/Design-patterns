package Adapter;

public class UsbAdapter implements UsbInterface {

    private MemoryCard memoryCard;

    public UsbAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void read() {
        memoryCard.read();
    }
}
