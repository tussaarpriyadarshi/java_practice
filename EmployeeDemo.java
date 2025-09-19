abstract class Employee{
    protected String name;
    protected int salary;
    //constructor
    public Employee(String name,int salary){
        this.name=name;
        this.salary=salary;

    }
    //abstract method
    public abstract void displaySalary();
}
//manager subclass
class Manager extends Employee{
    private int bonusPercent=20;
    public Manager(String name,int salary){
        super(name,salary);
    }
    @Override
    public void displaySalary(){
        int total=salary+(bonusPercent*salary)/100;
        System.out.println(name+"Total Salary ="+total);
    }
}
//developer subclass
class Developer extends Employee{
    private int bonusPercent =10;
    //constructor
    public Developer(String name,int salary){
        super(name,salary);
    }
    @Override
    public void displaySalary(){
        int total=salary+(bonusPercent*salary)/100;
        System.out.println(name+"Total salary ="+total);

    }
}
//main class
public class EmployeeDemo{
    public static void main(String[] args){
        Employee e;
        e=new Manager("anita",50000);
        e.displaySalary();
        e=new Developer("rohit", 40000);
        e.displaySalary();

        
    }
}
