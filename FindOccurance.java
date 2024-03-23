package DSA;
public class FindOccurance {
    public static int first =-1;
    public static int last =-1;
    
    public static void recursion(String str,int idx,char element){
        
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
        }
        char currChar =str.charAt(idx);
        if(currChar==element){
            first=idx;
        }else{
            last=idx;
        } 
        recursion(str,idx+1,element);   
    }

    public static void main(String [] args){
       String str = "abaacdaefaah";
       recursion(str,str.length()-1,'a');
    }

}
