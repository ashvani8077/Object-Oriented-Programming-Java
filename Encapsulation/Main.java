package Encapsulation;
class Student{
    private String name;
    private int age;
    private int roll_no;
    public void setter(String name, int age, int roll_no){
        this.name=name;
        this.age=age;
        this.roll_no=roll_no;
    }
    public void getter(){
        System.out.println(this.name);
        System.out.println(this.roll_no);
        System.out.println(this.age);
    }
}
public class Main {
    public static void main(String[] args) {
        Student st=new Student();
        st.setter("Ramprakash",99,1);
        st.getter();
    }
}
