package HierarchicalInheritance;

class A{
    void printA(){
        System.out.println("class A Method");
    }
}

class B extends A{
    void printB(){
        System.out.println("Class B Method");
    }
}

class C extends A{
    void printC(){
        System.out.println("Class C method");
    }
}
public class Hierarichal {
    public static void main(String[] args) {
        B obj=new B();
        obj.printA();
        obj.printB();
        System.out.println("======");
        C obj1=new C();
        obj1.printA();
        obj1.printC();;
    }
}
