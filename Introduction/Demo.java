package Introduction;

public class Demo {
    int a=5;
    public static void main(String[] args) {
        Car audi=new Car() {
            @Override
            public void print() {
                System.out.println("This is audi class");
            }
        };
        audi.print();
        audi.greet();
        Bike b=new Bike() {
            @Override
            public void bikeName() {
                System.out.println("Your dream bike is Bullet");
            }
        };
        b.bikeName();
        Demo d=new Demo();
        System.out.println(d.a);
    }
}
