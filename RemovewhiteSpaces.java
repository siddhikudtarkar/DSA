package DSA;
public class RemovewhiteSpaces {
    public static void main(String [] args){
        String str= "Java programming selenium automation ";

        str = str.replaceAll("\\s","");
        System.out.println("After removal of white spaces "+str);
    }
}
