package Singlton;

public class FirstClass {

    private String className;
    private String info;

    public FirstClass(String className, String info) {
        this.className = className;
        this.info = info;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "FirstClass{" +
                "className='" + className + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
