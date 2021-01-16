

public class Student
{
    String name;
    int student_id;
    String address;

    public Student(String name, int student_id, String address)
    {
        this.name = name;
        this.student_id = student_id;
        this.address = address;
    }

    public void printDetails()
    {
        System.out.println("Name is : "+name);
        System.out.println("Student ID is : "+student_id);
        System.out.println("Address is: "+address);
    }

    public static void main(String [] args)
    {
        Student stu1 = new Student("John", 1, "ABC street");
        Student stu2 = new Student("Doe", 2, "DEF street");
        stu1.printDetails();
        stu2.printDetails();
    }
}
