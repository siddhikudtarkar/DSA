package DSA;
import java.util.Scanner;

class Factorial{

  static int factorial(int n){
  int res = 1;
  for(int i=1;i<=n;i++){
     res=res*i;
     }
     return res;
   }
  public static void main(String[] args){
    Scanner line= new Scanner(System.in);
    int n = line.nextInt();
    System.out.println(factorial(n));
    line.close();
    }
}


