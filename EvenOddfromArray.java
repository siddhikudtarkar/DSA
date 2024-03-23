package DSA;
public class EvenOddfromArray{
    static int a[] = {1,2,3,4,5,6,7,8};
    public static void main (String[] args){
      /*  for(int i=0;i<a.length-1;i++){
          if(a[i]%2==0){
            System.out.println(" even no " + a[i]);
        }
    }
        for(int i=0;i<a.length-1;i++){
           if(a[i]%2!=0){
             System.out.println("odd no "+ a[i]);
            }
        }*/
        for(int value : a){
            if(value%2==0){
              System.out.println(" even no " + value);
          }
      }
          for(int value :a){
             if(value%2!=0){
               System.out.println("odd no "+ value);
              }
          }

       }
    }
