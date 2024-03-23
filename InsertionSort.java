package DSA;
import java.util.*;
public class InsertionSort {
    
    public static void main(String[] args){
      int a[] = {10,2,4,30,50};
      System.out.println("Arrays before sorting :" + Arrays.toString(a));  

      for(int i=0;i<a.length;i++){
        int current=a[i];
        int j=i-1;
        while(j>=0 && current<a[j]){
            a[j+1]=a[j];
            j--;  
        }
        a[j+1]=current;
      }
      System.out.println("Arrays after sorting :" + Arrays.toString(a)); 
    }
}
