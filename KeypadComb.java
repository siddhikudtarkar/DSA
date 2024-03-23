package DSA;
import java.util.HashSet;

public class KeypadComb {
    public static String[] keypad={".","abc","def","ghi","ijk","lmn"};
    
    

    public static void recursion(String str ,int idx,String combination,HashSet<String> set){
        if(str.length()-1==0){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];

        for(int i=0;i<mapping.length();i++){
            recursion(str,idx+1,combination+mapping.charAt(i),set);

        }

    }
    public static void main(String[] args){
        String str = "aaa";
        HashSet<String> set = new HashSet<String>();
        recursion(str,0,"",set);

    }
}

