package abstraction;

public interface InterfaceDemo {

    int a =10; // public, static ,final

     int getValue();

    static String getStaticMathod(){
        return "I am in static method of parent interface";
    }

    default String getDefaultMathod(){
        return "I am in default method of parent interface";
    }

    default String getName(){
        return null;
    };

    class InterfaceDemoclass{

    }
}

// util java 8

// static, default method
