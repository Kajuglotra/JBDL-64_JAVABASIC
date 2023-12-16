package exception;

import java.io.Closeable;
import java.io.IOException;

public class AutoCloseableDemo implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("I am inside the close method");
    }

    public void test(){
        System.out.println("I am in test");
    }

    public static void main(String[] args) {
        try(AutoCloseableDemo d = new AutoCloseableDemo();AutoCloseableDemo d1 = new AutoCloseableDemo() ){
            d.test();
            d1.test();
        }catch (Exception e){

        }finally {
            System.out.println("finally ");
        }
//        AutoCloseableDemo d1 =null;
//        try{
//            d1.test();
//        }catch (Exception e){
//
//        }finally {
//            d1.close();
//        }
    }
}
