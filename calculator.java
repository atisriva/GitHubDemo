/* Java Program Example - Make Calculator */
		
import java.util.Scanner;

public class JavaProgram
{
    public static void main(String args[])
    {
        float a, b, res;
        char choice, ch;
        Scanner scan = new Scanner(System.in);
	//Start of do loop - Conditional statement	
        do
        {
            System.out.print("1. Addition\n");
            System.out.print("2. Subtraction\n");
            System.out.print("3. Multiplication\n");
            System.out.print("4. Division\n");
            System.out.print("5. Exit\n\n");
            //User is prompted to enter the choice of calculation
	    System.out.print("Enter Your Choice : ");
            choice = scan.next().charAt(0);
            switch(choice)
            {
                case '1' : System.out.print("Enter Two Number : ");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a + b;
                    System.out.print("Result = " + res);
                    break;                
            }
            System.out.print("\n---------------------------------------\n");
        }while(choice != 5);       
    }
}
