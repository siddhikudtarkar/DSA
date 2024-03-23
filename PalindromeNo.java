package DSA;
import java.util.*;
public class PalindromeNo {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        //String str="";
        //int orgNum=num;

        int rev =0;
         while(num!=0){
            rev=rev*10+(num%10);
            num=num/10;
         }
         //System.out.println(rev);

        /*StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println(rev);*/
        
        /*StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev=sbl.reverse();
        System.out.println(rev);*/
        sc.close();

        if(num==rev){
            System.out.println("Is a palindrome no");

        }
        else
        {System.out.println("Is not a palindrome no:");
    }
    }
    
}
