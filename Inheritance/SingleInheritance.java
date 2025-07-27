package Inheritance;

class employee{
    void salary(){
        System.out.println(70000);
    }
}
class hr extends employee{
    void bonus(){
        System.out.println(20000);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        hr obj=new hr();
        obj.salary();
        obj.bonus();
    }
}
