package exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Demo {

    public void test(int b){
        try{
            int a =10;
            int c =a/b; // throwing an exception, that means code has been haulted, it will not move forward
            System.out.println("here i am on line 8");
            String abc = "abc";
            Integer inte = Integer.valueOf(abc);
        }catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("U have provided wrong input, please try with another input");
        }catch (NumberFormatException e){
            System.out.println(e);
            System.out.println("U are trying to convert wrong value to int");
        }catch (Exception e){
           System.out.println(e);
        }finally{
            System.out.println("Finally block");
        }

    }
    public void test2() throws IOException, SQLException { // test2 method throw karta hai ioexception
        throw new IOException();

    }
    public void test3() throws IOException, SQLException {
       test2();
    }

    public void test1(int b){
        int a =10;
        int c =a/b; // throwing an exception, that means code has been haulted, it will not move forward
        System.out.println("here i am on line 8");
        String abc = "abc";
        Integer inte = Integer.valueOf(abc);
    }

    public void readDataFromFile() throws IOException {
//        FileInputStream i = null;
        try(FileInputStream i = new FileInputStream("/Users/kajalglotra/Downloads/JBDL-64-JavaBasic")){

        }catch (Exception e){

        }
    }
    public static void main(String[] args) throws IOException, SQLException {
        Demo d = new Demo();
         d.test3();
        System.out.println("i m in main");

    }
}
