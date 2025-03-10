import java.util.*;
public class Employee {

    String name,id;
    int salary;

    Employee(String name,String id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    void printDetails(){
        System.out.println("Employee Name is "+this.name);
        System.out.println("Employee Id is "+this.id);
        System.out.println("Employee Salary is "+this.salary);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.next();
        String id=sc.next();
        int salary=sc.nextInt();

        Employee e1=new Employee(name,id,salary);

        e1.printDetails();
    }
}
