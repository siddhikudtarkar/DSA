package DSA;
public class PrintNosRecursion {

  public static void printNum(int n){

    if(n==0)//if(n==6)
    {
        return;
    }

    System.out.println(n);
    printNum(n-1);//printNum(n+1);
  }
    public static void main(String[] args){
        printNum(5);//1
    }
    
}
