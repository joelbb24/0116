import java.util.*;

public class Calculator
{
    public static void main(String [] args)
    {
        System.out.println("___________CALCULATOR_____________");
        System.out.println("Select your choice....");
        System.out.println("1.           for addition");
        System.out.println("2.           for subtraction");
        System.out.println("3.           for multiplication");
        System.out.println("4.           for divison");
        System.out.println("0.           EXIT");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        System.out.println("Enter two numbers");
        int var1 = sc.nextInt();
        int var2 = sc.nextInt();
        int result;


        do
        {
            switch(choice)
            {
                case 1: 
                    System.out.println("You have chosen addition");
                    result = var1 + var2;
                    System.out.println("Your result is : "+ result);
                    break;

                case 2: 
                    System.out.println("You have chosen subtraction");
                    result = var1 - var2;
                    System.out.println("Your result is : "+ result);
                    break;

                case 3: 
                    System.out.println("You have chosen multiplication");
                    result = var1 * var2;
                    System.out.println("Your result is : "+ result);
                    break;

                case 4: 
                    System.out.println("You have chosen division");
                    result = var1 / var2;
                    System.out.println("Your result is : "+ result);
                    break;
                
                case 0:
                    System.out.println("_________EXITING________");
                    break;

                default:
                    System.out.println("You have chosen wrong choice");
                    break;
            }
            System.out.println("Enter choice.....");
            choice = sc.nextInt();
            if(choice!=0)
            {    
                System.out.println("Enter two numbers....");
                var1 = sc.nextInt();
                var2 = sc.nextInt();
            }
        }while(choice!=0);


                
    }
}
