package Assignments;
import java.util.Arrays;

public class Assignment5 {
      
    public static int getLargest(int[] a, int total){  
    Arrays.sort(a);  
    return a[total-1];  
    }  
    public static void main(String args[]){  
    int a[]={67,92,58,54,76,80};  
    int b[]={44,66,99,77,33,22,55};  
    System.out.println("Largest: "+getLargest(a,6));  
    System.out.println("Largest: "+getLargest(b,7));  
    }}
    

