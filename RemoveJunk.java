package DSA;
public class RemoveJunk {
    public static void main (String[] args){
    String s ="a 46667 &&& latin string @#$%&* @#$%";
    String s1 ="@#$%%^ testing #$%^&&* Selenium ";

    s= s.replaceAll("[^a-zA-Z0-9]","");
    System.out.println(s);

    s1=s1.replaceAll("[^a-zA-Z0-9]","");
    System.out.println(s1);

    }
}
