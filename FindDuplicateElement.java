package DSA;
import java.util.*;
public class FindDuplicateElement {
   public static void main(String[] args){
    String arr[]={"Java","C","C++","Python","Go","Java"};

    /*boolean flag=false;
    for (int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if (arr[i]==arr[j]){
                System.out.println("Found Duplicate elements "+arr[i]);
                flag =true;
            }
        }
    }
    if(flag==false){
        System.out.println("Duplicate elements not found");
    }*/

    boolean flag = false;
    HashSet <String> lang = new HashSet<String>();
    for(String l : arr){
        if(lang.add(l)==false){
            System.out.println("Found Duplicate elements "+ l);
            flag=true;
        }
    }
    if(flag==false){
        System.out.println("Not found duplicate elements");
    }
   }
}
