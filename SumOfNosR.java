package DSA;
public class SumOfNosR {
    
    public static void printSum(int i, int n, int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        printSum(i+1,n,sum+=i);


    }
    public static void main(String[] args){
        printSum(1,5,0);
    }
}
