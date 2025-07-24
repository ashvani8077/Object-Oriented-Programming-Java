package Inheritance;
//
//public class Parent {
//    void display(){
//        System.out.println("Parent class method");
//    }
//}
//
//class child extends Parent{
//    void show(){
//        System.out.println("Child extended");
//    }
//}
//
//class inheritance{
//    public static void main(String[] args) {
//        child child1=new child();
//        child1.display();
//        System.out.println();
//        child1.show();
//    }
//}



class Vehicle{
    double price;
    double mileage;
    String color;
    void display(){
        System.out.println(price);
        System.out.println(mileage);
        System.out.println(color);
    }
}

class Car extends  Vehicle{
    String ftype;
    boolean sunroof;
    String brand;

}

public class Parent{
    public static void main(String[] args) {
        Car car1=new Car();
        car1.brand="Tata";
        car1.price=1500000;
        car1.mileage=18.3;
        car1.ftype="Diesel";
        car1.color="Red";
        car1.sunroof=true;
        car1.display();
        System.out.println(car1.sunroof);
    }
}