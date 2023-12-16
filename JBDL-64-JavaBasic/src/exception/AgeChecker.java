package exception;

public class AgeChecker extends Object {
    int age;

    public int ageChecking(int age) {
        if(age> 18){
            System.out.println("age is valid");
            return 1;
        }else{
            throw new CustomExceptionDemo("age is not valid");
        }
    }

    public static void main(String[] args) {
        AgeChecker a = new AgeChecker();
        a.ageChecking(2);
    }
}
