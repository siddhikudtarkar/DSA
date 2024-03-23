package DSA;
public class CountCharacterOccurences{
    public static void main(String[] args){
        String str="java is a programming language";
 
        int totalCount=str.length();
        int totalCount_afterRemove=str.replace("a","").length();

        int count=totalCount-totalCount_afterRemove;

        System.out.println("Number of Occurences of a : " +count);
        
    }
}
