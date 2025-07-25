package Abstraction;
abstract class Car{
    abstract public void fuelType();
    public void color(){
        System.out.println("Black Color");
    }
}

class Tata extends Car{
    @Override
    public void fuelType(){
        System.out.println("DIESEL");
    }
}


public class Main {
    public static void main(String[] args) {
        Tata t=new Tata();
        t.fuelType();
        t.color();
    }
}
