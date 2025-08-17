package csuper;


public class Main {
    public static void main(String[] args) {
        //super= Refers to the parent class (subclas < - superclass)
        //Used in constructors and method over ridding
        //Cells the parents constructors to initialize attributes
        

    Person person = new Person ("Tom" , "Riddle");
    Student student = new Student("Harry" ,"Potter" ,  4.5);
    Employee employee = new Employee("Rubeus" ,"Hagrid" ,  50000);
    
    person.showname();
    student.showname();
    employee.showname();

    student.showGPA();
    employee.showSalary();
    
    }
    
}