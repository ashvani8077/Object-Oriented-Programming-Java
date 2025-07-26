package Introduction;

public class Demo {
    int a=5;
    public static void main(String[] args) {
        Car audi=new Car() {
            public void print() {
                System.out.println("This is audi class");
            }
        };
        audi.print();
        audi.greet();
        Bike b=new Bike() {
            public void bikeName() {
                System.out.println("Your bike is Bullet");
            }
        };
        b.bikeName();
    }
}

