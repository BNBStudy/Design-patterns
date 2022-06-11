package Adapter;

public class Computer {
    public void read (UsbInterface usbInterface) {
        usbInterface.read();
        System.out.println("Информация прочитана");
    }
}
