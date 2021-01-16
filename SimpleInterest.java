

public class SimpleInterest
{
    public static void main(String [] args)
    {
        int principle = 75000;
        int rate = 3;
        int time = 7;

        System.out.println(calcSimpleInterest(principle,rate,time));
    }

    public static int calcSimpleInterest(int p, int r, int t)
    {
        return (p*r*t)/100;
    }

}
