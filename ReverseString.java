package DSA;
public class ReverseString {
    public static void main (String[] args){
        String str ="ABCD";
        // String rev="";
        
        // int len = str.length();
        // for(int i=len-1;i>=0;i--){
        //     rev=rev+str.charAt(i);
        // }
        // char a[] = str.toCharArray();
        // int len=a.length;
        // for(int i=len-1;i>=0;i--){
        //     rev=rev+a[i];
        // }
        

        /*StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());*/

        StringBuilder sbl = new StringBuilder(str);
        System.out.println(sbl.reverse());

        //System.out.println("Reverse string is :"+rev);

    }
}
