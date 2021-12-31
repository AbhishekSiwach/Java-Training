import java.io.*;
import java.util.Scanner;

class operation{
    public static void main(String[] args)
    {
        int number1  ,number2 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        number1 = sc.nextInt();
        
        System.out.println("Enter the Second number");
        number2 = sc.nextInt();

        int sum = number1 + number2;
        System.out.println(" Sum=" +sum);
        
        int sub = number1 - number2;
        System.out.println(" Subtraction=" +sub); 

       int mult = number1 * number2;
       System.out.println(" Multiplication=" + mult);

       int div = number1 / number2;
       System.out.println(" Division=" + div);
    }
}