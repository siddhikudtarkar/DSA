package DSA;
import java.util.*;
public class EvenOddCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int evenCount=0;
        int oddCount=0;
        while(num>0){
            int rem=num%10;
            if(rem%2==0){
               evenCount++;
            }
            else{
                oddCount++;
            }
            num=num/10;
        }
       System.out.println(evenCount+" "+oddCount);
    sc.close();
    }
    
    
    
}
