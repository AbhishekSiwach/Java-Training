package Assignments;
import java.util.Scanner;

public class Pattern2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n, space=1;
      System.out.println("Enter n=");
      n = sc.nextInt();
      space =n-1;
      for(int i = 1; i<=n; i++){
          for(int j = 1; j<=i; j++){
              System.out.print("\\");
          }space --;
          for(int k=1; k<=i; k++){
              System.out.print("/");
          }
          System.out.println();
      }
       space = 1;
    
      for(int i = n; i>=1; i--){
         for(int j = 1; j<=i; j++){
             System.out.print("/");
         }
         space ++;
         for(int k = 1; k<=i; k++){
             System.out.print("\\");
         }
         System.out.println();
      }

    }
}


