package abstraction;

public interface InterfaceDemo2 {
    default String getDefaultMathod(){
        return "I am in default method of parent interface";
    }
     int getValue();

    static String getStaticMathod(){
        return "I am in static method of parent interface";
    }
}
