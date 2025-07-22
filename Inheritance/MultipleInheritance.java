package Inheritance;

interface A1{
    void run();
}
interface B1{
    void run();
}
class AB implements A1,B1{
    public void run(){
        System.out.println("Hello");
    }
}


public class MultipleInheritance {
    public static void main(String[] args) {
        A1 a=new AB();
        a.run();
        B1 b=new AB();
        b.run();
        AB a1=new AB();
        a1.run();
    }
}
