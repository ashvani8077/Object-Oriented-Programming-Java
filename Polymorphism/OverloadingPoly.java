package Polymorphism;
class A{
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a,int b, int  c){
        return a+b;
    }
    double sum(double a, double b){
        return a+b;
    }
    double sum(double a, double b,double c){
        return a+b+c;
    }
}

public class OverloadingPoly {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.sum(2,3));
        System.out.println("========");
        System.out.println(a.sum(4,6,8));
        System.out.println("=========");
        System.out.println(a.sum(5.0,8.5));
        System.out.println("==========");
        System.out.println(a.sum(7.9,4.9,9.3));
    }
}
