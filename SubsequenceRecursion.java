package DSA;
import java.util.HashSet;

public class SubsequenceRecursion {
    public static void subsequenceRecursion(String str, int idx, String newString,HashSet<String> set){
    if(idx==str.length()){
        if(set.contains(newString)){
        return;
    }else{ 
        System.out.println(newString);
        set.add(newString);
        return;
    }
       
}
    char currChar = str.charAt(idx);
    
    subsequenceRecursion(str,idx+1,newString+currChar,set);

    subsequenceRecursion(str,idx+1,newString,set);
}
    

    public static void main(String[] args){
    String str= "aaa";
    HashSet <String> set = new HashSet<>();

    subsequenceRecursion(str,0,"",set);
    }
}

