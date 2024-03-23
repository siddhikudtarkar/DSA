package DSA;

public class SwapNos{
    public static void main(String args[]){
        int a=10,b=20;
        System.out.println("Before swapping values :" +a+" "+b);
        /*t=a;
        a=b;
        b=t;
        System.out.println("After swapping values :" +a+" "+b);
        */
        
        /*a=a*b;
        b=a/b;
        a=a/b;*/
        
        /*a=a^b;
        b=a^b;
        a=a^b;*/
        
        b=a+b-(a=b);
        System.out.println("After swapping values :" +a+" "+b);

        //a and b values shouls not be zero
        
        


        

        
    }
}
