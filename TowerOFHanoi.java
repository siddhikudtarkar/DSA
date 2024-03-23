package DSA;
public class TowerOFHanoi {

    public static void recursion(int n,String src,String helper,String destination){
    if(n==1){
        System.out.println("transfer of disk " + n + " from " + src+ " to "+ destination);
        return;
    }
    recursion(n-1,src,destination,helper);
    System.out.println("transfer of disk " + n + " from "+ src+ " to "+destination);
    recursion(n-1,helper,src,destination);
}
    public static void main(String[] args){
       int n=3;
       recursion(n,"S","H","D");
    }
}
