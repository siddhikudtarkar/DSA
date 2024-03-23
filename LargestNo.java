package DSA;
import java.util.*;

public class LargestNo {
    public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
   
    System.out.println("Enter first number:");
    int a=sc.nextInt();

    System.out.println("Enter second number:");
    int b=sc.nextInt();

    System.out.println("Enter third number:");
    int c=sc.nextInt();

    /*if(a>b && a>c){
        System.out.println(a + "is a largest no");
    }
    else if(b>a && b>c){
        System.out.println(b + "is a largest no");
    }
    else{
        System.out.println(c+"is a largest no");
    }*/
    int largest =(c>(a>b?a:b)?c:(a>b?a:b));
    System.out.println(largest + "is a largest no");
    
    sc.close();
    }

}
