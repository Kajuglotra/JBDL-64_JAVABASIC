package encapsulation;

public class Main {

   private  String type;
    public static void main(String[] args) {
        Main main = new Main();
        main.type = "mentor/gfg";
        if(main.type.equalsIgnoreCase("mentor/gfg")) {
            Lecture2 lecture2 = new Lecture2();
            lecture2.mentor = "kajal";

            Lecture lecture = new Lecture();
            lecture.mentor = "";
            lecture2.setMentor("kajal");
            lecture2.setTitle("oops concepts");
        }

    }

    public int add (int n1, int n2){
        return n1+n2;
    }
}