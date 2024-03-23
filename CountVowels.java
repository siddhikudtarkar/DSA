package DSA;
public class CountVowels
{
    static int countVowels(String s){
    int count = 0;

    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c =='a'|| c == 'e'|| c== 'i' || c=='o'|| c=='u'||
            c=='A'|| c=='E'|| c=='O'|| c=='I'|| 
            c=='U')
            {
                count++;
            }   
    }
    return count;
}
    public static void main(String []args){
    String s ="abcbea";
    System.out.println(countVowels(s));
    }    
}
