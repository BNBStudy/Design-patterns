package Singlton;

public class Logging {

    private static Logging logging;

    private Logging(){}

    public static Logging getLogging() {
        if (logging == null) {
            logging = new Logging();
        }
        return logging;
    }

    public void logInfo(Object object) {
        System.out.println(object);
    }


}
