package abstraction;

public abstract class AbstractDemo {

    private int getPrivateValue(){
        return 0;
    }

    public int print(){
        System.out.println("print data");
        return 0;
    }
    public abstract int getValue();
}
