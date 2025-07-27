package AccessModifier;
class Student{
    String name;
    protected int age;
    private int roll_no;

    public Student(String name, int age, int roll_no){
        this.name=name;
        this.age=age;
        this.roll_no=roll_no;
    }
    void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(roll_no);
    }
}
public class Main {
    public static void main(String[] args) {
        Student student1=new Student("NAMAN",34,3);
        student1.print();
        System.out.println(student1.name);
    }
}
