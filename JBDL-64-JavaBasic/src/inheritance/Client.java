package inheritance;

public class Client {

    public static void main(String[] args) {
        Child child = new Child(10);
//        Child child1 = new Child();
        System.out.println(child.getParentSum());
//        System.out.println(child.sum2);

    }
}
