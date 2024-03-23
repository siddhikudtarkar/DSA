package DSA;
/**
 * SearchRotatedArray
 */
public class SearchRotatedSortedArray {

    public static int search(int[] a, int target){
        int l=0 ,h=a.length-1, m=0;
        while(l<=h){
            m=(l+h)/2;
            if(target == a[m]){
                return m;      
            }
            //leftsorted portion
            else if(a[l] <= a[m]){
                if(target>=a[l] && target<a[m]){
                    h=m-1;
                }
                else{ 
                    l=m+1;
                }
            }
            //rightsorted portion
            else {
               if(target<= a[h] && target<a[m]){
                 l=m+1;
               }
                else{
                  h=m-1;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int ar[] = {4,5,6,7,8,1,2};
       // int ar[]={7,8,1,2,4,5,6};
       System.out.println(search(ar,7));
    }
}
