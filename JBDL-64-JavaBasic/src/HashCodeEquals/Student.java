package HashCodeEquals;

public class Student {
    private String name;

    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public int hashCode(){
        return this.age.hashCode()+this.name.hashCode();
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }
        if(o.getClass() != this.getClass()){
            return false;
        }
        Student s = (Student) o;
        if(s.getName().equalsIgnoreCase(this.getName()) && s.getAge()==this.getAge()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Student s1  =new Student("john" , 23);
        Student s2  =new Student("john" , 23);
//        System.out.println("s1 hashcode " + s1); // s1 is alphanumeric ref variable
//        System.out.println("s2 hashcode " + s2.hashCode());
        System.out.println(s1.equals(s2));



    }
}

// name of 2 object + age of two objects are same then return true
