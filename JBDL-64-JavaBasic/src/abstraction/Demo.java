package abstraction;

public class Demo extends Error{

    public void print(){
//        String sunday = "sunday";
        System.out.println(EnumDemo.valueOf("MONDAY"));
      for(EnumDemo d: EnumDemo.values()){
          System.out.println(d.ordinal());
      }
    }


    public static void main(String[] args) {
        Demo demo = new Demo();
        String str1 = new String("str");
        String str2 = new String("str");
        if(str1 == str2){
            System.out.println("in if");
        }else{
            System.out.println("in else");
        }
        System.out.println(str1.equals(str2));
//        demo.print();
    }

}
