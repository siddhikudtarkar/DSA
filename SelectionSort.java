import java.util.*;
public class SelectionSort{
    public static void main(String[] args){
        int a[] = {40,2,50,3,100};
        System.out.println("Arrays before sorting :"+ Arrays.toString(a));
        
        for(int i=0;i<a.length-1;i++){
            int smallest = i;
            for (int j =i+1;j<a.length;j++ ){
                if(a[smallest]>a[j]){
                     smallest=j;
                }
            } 
            int temp=a[smallest];
            a[smallest]=a[i];
            a[i]=temp;

        }
        System.out.println("Array after sorting :"+ Arrays.toString(a));
}
}
