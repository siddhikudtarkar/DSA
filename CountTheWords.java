package DSA;
import java.util.Scanner;

public class CountTheWords {
    public static void main(String[] args){

        int count =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String s= sc.nextLine();
        
        
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println("Number of words in a string are :" +count);
    sc.close();
    }
}
