package inheritance;

public class Parent2 extends Parent3{

    public Parent2(){
        super();
        System.out.println("i am inside the constructor of Parent2 class");
    }

    int sum =10;

    private int sum2 =20;

    public Parent2(int sum){
        this.sum =sum;
    }

    public int getA(){
        return 10;
    }
    public int getB(){
        return 10;
    }

    public int getParentSum(){
       return super.sum;
    }
    public String getValue(){
        return "abc";
    }
}
