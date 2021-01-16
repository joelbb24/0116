

public class Employee
{
    String name;
    int employeeID;
    boolean status;
    double salary;

    public Employee(String name, int employeeID, boolean status, double salary)
    {
        this.name = name;
        this.employeeID = employeeID;
        this.status = status;
        this.salary = salary;
    }

    public boolean terminate(boolean status)
    {
        return status = false;
    }

    public void printDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Employee ID: "+employeeID);
        System.out.println("Status: "+status);
        System.out.println("Salary :"+salary);
    }

    public double raiseSalary(double amount)
    {
        return salary = salary + amount;
    }

    public static void main(String [] args)
    {
        Employee ep1 = new Employee("John", 1001, true, 20400.0);
        ep1.printDetails();
        ep1.status = ep1.terminate(ep1.status);
        ep1.salary = ep1.raiseSalary(200);
        ep1.printDetails();
    }
}
