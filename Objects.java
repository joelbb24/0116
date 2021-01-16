

public class Objects
{
    int age;
    String name;
    
    public Objects(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public static void main(String [] args)
    {
        Objects obj = new Objects(26,"Joel");
        obj.displayInfo(obj.age, obj.name);
    }

    public void displayInfo(int age, String name)
    {
        System.out.println(age+ " " + name);
    }   
}
