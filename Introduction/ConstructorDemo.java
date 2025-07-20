package Introduction;

public class ConstructorDemo {
    int id;
    int age;
    public ConstructorDemo(int id, int age){
        this.id=id;
        this.age=age;
        System.out.println("Data added successfully");
    }
    public ConstructorDemo(){
        System.out.println("Hello "+this.id);
    }

    public static void main(String[] args) {
        ConstructorDemo s1=new ConstructorDemo(1,23);
        ConstructorDemo s2=new ConstructorDemo(2,33);
        System.out.println(s1.age+" " +s1.id);
        ConstructorDemo s=new ConstructorDemo();
    }
}
