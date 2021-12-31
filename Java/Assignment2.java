 import java.io.*;
 import java.util.Scanner;

 class Findinglargest {
     public static void main(String[] args)
     {
         int a,b,c,largest,temp;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the first number");
         a = sc.nextInt();

         System.out.println("Enter the Second number");
         b = sc.nextInt();

         System.out.println("Enter the Third number");
         c = sc.nextInt();

         temp=a>b?a:b;
         largest=c>temp?c:temp;
         System.out.println("The largest number is" +largest);


     }

    
}
