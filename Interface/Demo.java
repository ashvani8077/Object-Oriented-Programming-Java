package Interface;

interface Car{
    public void start();
}
class ElectricCar implements Car{
    public void start(){
        System.out.println("Car is starts");
    }
}
class DieselCar implements Car{
    @Override
    public void start() {
        System.out.println("Car of diesel running");
    }
}

public class Demo {
    public static void main(String[] args) {
        Car tesla=new DieselCar();
        Car xuv=new ElectricCar();
        DieselCar ds=new DieselCar();
        ds.start();
        xuv.start();
        tesla.start();
        Car c=new Car() {
            public void start(){
                System.out.println("Interface ka object ban gaya");
            }
        };
        c.start();
    }
}
