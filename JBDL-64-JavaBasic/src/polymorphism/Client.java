package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Calculator c = new AdvancedCalculator(); // c is an address of calculator object
        // c is parent ref variable, object is child
        AdvancedCalculator advancedCalculator  = (AdvancedCalculator) c; // downcasting

        List<String> list = new ArrayList<>();
        System.out.println(advancedCalculator.add(1,2, 3));

        Calculator ca = (Calculator) new AdvancedCalculator();// upcasting done by compiler

        Calculator calculator  = new Calculator();
        AdvancedCalculator advancedCalculator1 = (AdvancedCalculator) calculator;
        System.out.println(advancedCalculator1.multiply(1,2));

        AdvancedCalculator calculator1 = new AdvancedCalculator();
        Calculator c2 = (Calculator) calculator1;
        System.out.println(c2.add(1,2));

    }
}
