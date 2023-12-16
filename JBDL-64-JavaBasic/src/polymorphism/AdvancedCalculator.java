package polymorphism;

public class AdvancedCalculator extends Calculator {

    @Override
    public int add(int a, int b, int c){
        return 1+a+b+c;
    }

    public int multiply(int a, int b){
        return a*b;
    }
}
