package Introduction;

public class WrapperClasses {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        Integer num1=45;
        Integer num2=50;
        swap(num1, num2);
        swap(a,b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(num1);
        System.out.println(num2);

        final  int bonus=38;
        System.out.println(bonus);
    //    bonus=5;
        System.out.println(bonus);

        final A ashu=new A("Ashvani Sharma");
        ashu.name="Ashu";       //This can be done
       // ashu=new A("Ashvani");  //but this one is not

    }

    static void swap(Integer a, Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }



    static class A{
        final int num=10;
        String name;

        public A(String name){
            this.name=name;
        }
    }
}
