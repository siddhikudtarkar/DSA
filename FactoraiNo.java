package DSA;
public class FactoraiNo {
    //5*4*3*2*1=120 5!
    public static void main(String[] args){
      int num=5;
      int fact = 1;
      for(int i=1;i<=num;i++){
        fact=fact*i;
      }
      System.out.println("factorial value is : " +fact);
    }
}
