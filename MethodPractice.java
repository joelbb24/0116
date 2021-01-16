public class MethodPractice
{
    public static void main(String [] args)
    {
        boolean abc = true;
        boolean output = toggleSwitch(abc);
        System.out.println(output);
        System.out.println(sum(5,4));
    }

    public static void greetSomeone() 
    {
        System.out.println("Hello");
        System.out.println("How are you doing?");
    }

    public static boolean toggleSwitch(boolean sw)
    {
        return !sw;
    }

    public static int sum(int var1, int var2)
    {
        return var1 + var2;
    }
}
