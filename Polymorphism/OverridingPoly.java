package Polymorphism;

class Demo{
    void print(){
        System.out.println("Demo");
    }
}
class DemoChild extends Demo{
    @Override
    void print(){
        System.out.println("Demo Child");
    }
}

public class OverridingPoly {
    public static void main(String[] args) {
        DemoChild dc=new DemoChild();
        dc.print();
        System.out.println("=======");
        Demo d=new Demo();
        d.print();
    }
}
