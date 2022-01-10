package Assignments;

public class Pattern4 {
    
    public static void main (String[] args) {

        appearrocket();     
        //appearrocket();

    }



    public static void appearrocket() {

        cone();
        box();
        label();
        box();
        cone();     
    }



    public static void box() {

        System.out.println("+------+\t"+"+------+");
        System.out.println("|      |\t"+"|      |");
        System.out.println("|      |\t"+"|      |");
        System.out.println("+------+\t"+"+------+");

    }

    public static void cone() {

        System.out.println("   /\\\t\t"+"   /\\");
        System.out.println("  /  \\\t\t"+"  /  \\");
        System.out.println(" /    \\\t\t"+" /    \\");      
    }

    public static void label() {

        System.out.println("|United|\t"+"|United|");
        System.out.println("|States|\t"+"|States|");
    }
}
