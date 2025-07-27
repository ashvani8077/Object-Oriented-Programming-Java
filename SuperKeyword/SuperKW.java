package SuperKeyword;

class Animal{
    String color="White";
    void eat(){
        System.out.println("Eating....");
    }

    public Animal(){
        System.out.println("Animal constructor");
    }
}
class Dog extends Animal{
    String color="Black";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);;
    }
    void eat(){
        System.out.println("Eating Bread...");
    }
    void bark(){
        System.out.println("Barking");
    }
    void work(){
        super.eat();
        bark();
    }
    Dog(){
        System.out.println("Dog constructor");
    }
}
public class SuperKW {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.printColor();
        System.out.println("=========");
        d.work();
    }
}
