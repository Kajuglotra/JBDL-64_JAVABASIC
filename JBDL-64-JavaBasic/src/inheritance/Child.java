package inheritance;

public class Child extends Parent2{
    int sum=20;
    int sum1=20;
    public Child(int sum){
        super();
        this.sum1 =sum;
        System.out.println("i am inside the constructor of child class");
    }

    public int getParentSum(){
        return  super.getParentSum();
    }



}
