package DSA;
//import java.util.*;
public class ReverseEachWordInaString {
    public static void main(String[] args){
       
        // Scanner sc= new Scanner(System.in);
        // String s = sc.nextLine();
        
        // String reverseString="";
        // String[] words=s.split(" ");

        // for(String w:words){

        //     String reverseWord="";

        //     for(int i=w.length()-1;i>=0;i--){
        //         reverseWord=reverseWord+w.charAt(i);
        // }
        
        //   reverseString=reverseString+reverseWord+" ";


        //}
        String str=" Welcome to java";
        String [] word = str.split("//s");
        
        String reverseString="";
        String reverseWord="";
        
        for(String w :word){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord=reverseWord+sb.toString()+"";
        }
        System.out.println("Reversed String: " + reverseString);


    }
}
