package Introduction;

public class Main {
    public static void main(String[] args) {
        //store 5 roll no
        int roll[]=new int[5];

        //store name
        String [] names=new String[5];

        //data of 5 students( rollno, name, marks)
        int ro[]=new int[5];
        String name[]=new String[5];
        float marks[]=new float[5];

        Student student1=new Student(5,"Asvhani",3.2f);
        Student student2=new Student(5,"Rakesh",3.2f);
        System.out.println(student1);
        student1.greeting();
        student2.greeting();

    }

    //create a class

}


class  Student{
    int roll;
    String name;
    float marks;
    public Student(int roll, String name, float marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;

    }
    void greeting(){
        System.out.println("Hello "+this.marks);
    }
}