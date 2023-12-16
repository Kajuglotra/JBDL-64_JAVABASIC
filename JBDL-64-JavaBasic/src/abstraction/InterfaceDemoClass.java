package abstraction;

public class InterfaceDemoClass implements InterfaceDemo{
    @Override
    public int getValue() {
        return 0;
    }

    public String getDefaultMathod(){
        return "I am in default method of child interface";
    }
    public String getName(){
        return "InterfaceDemoClass";
    }
}
