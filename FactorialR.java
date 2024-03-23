package DSA;
public class FactorialR{
    public static int calcfactorial(int n){
        if(n==1|| n==0){
            return 1;

        }
        
        int num=calcfactorial(n-1);
        int fact = n * num;
        return fact;
    }
    public static void main(String[] args){

        
        int ans =calcfactorial(5);
        System.out.println(ans);
        }
}








