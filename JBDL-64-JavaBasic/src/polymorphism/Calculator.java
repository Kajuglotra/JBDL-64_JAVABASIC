package polymorphism;

public class Calculator  {

    private int a=20;

    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }

    public String add(String a, String b){
        return a+b;
    }

}
