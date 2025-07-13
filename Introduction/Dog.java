package Introduction;

public class Dog {
    int id;
    String name;
    String eat="Bone";

    public void eat(){
        System.out.println(this.name+ " "+this.eat);
    }
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.name="Dogesh";
        d1.eat();

    }
}
