package DSA;
import java.util.Arrays;
import java.util.*;

public class SortingElements{

    static Integer a[] = {10,2,40,30,7};
    public static void main(String[] args){
    
    /*  System.out.println("Array elements befor sorting :" +Arrays.toString(a));
      Arrays.parallelSort(a);
      System.out.println("Array element after sorting :" +Arrays.toString(a));
      
      System.out.println("Array elements befor sorting :" +Arrays.toString(a));
      Arrays.sort(a);
      System.out.println("Array element after sorting :" +Arrays.toString(a));
      */
      System.out.println("Array elements befor sorting :" + Arrays.toString(a));
      Arrays.sort(a,Collections.reverseOrder());
      System.out.println("Array element after sorting :" + Arrays.toString(a));

    } 
}

