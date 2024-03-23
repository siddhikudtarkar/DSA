package DSA;
public class CharacterOccurences {
    static int characterOccurences(String s){
        int count =0;
        for(int i=0;i<s.length();i++){
            char ch='A';
            if(ch==s.charAt(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
    String s = "JAVA";
    System.out.println(characterOccurences(s));
        
    }
}
