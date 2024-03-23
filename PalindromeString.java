package DSA;
import java.util.*;

public class PalindromeString {
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String rev="";
    int len = str.length();
    for(int i=len-1;i>=0;i--){
      rev = rev+str.charAt(i); 
    }
    System.out.println(rev);
    sc.close();

    if(str.equals(rev)) {
     System.out.println("Is a palindromic string");
    }
    else{
        System.out.println("Is  not a palindromic string");
    }

}
}
