package constructor;

public class Student {
     String name;
    int age;
    double gpa;
    boolean isEnrolled;

    //Setting up a constructor!

    /*Same way
    Student( String a, int b, double c)
    {
        this.name= a;
        this.age=b;
        this.gpa =c;  //this will also work in the same way
    }*/

    Student( String name, int age, double gpa )
    {
        this.name= name;
        this.age=age;
        this.gpa = gpa;
        this.isEnrolled=true;;
    }
    void study(){
        System.out.println(this.name + " is studying  ");
    }

}
