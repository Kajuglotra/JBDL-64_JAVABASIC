package abstraction;

public enum EnumDemo {
    SUNDAY("sunday", 1),
    TUESDAY("tuesday", 4),
    MONDAY("monday" , 3);

    String val;
    int id;
    EnumDemo(String val, int id){
        this.val =val;
        this.id = id;
    }
}
