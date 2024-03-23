package DSA;
/**
 * BooksAllocation
 */
public class BooksAllocation {

    static boolean isPossibleSol(int[] ar, int b, int m) {
        int students = 1;
        int spc =0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i] > m){
                return false;
            }
            if(spc + ar[i] <= m){
                spc = spc + ar[i];
            }
            else {
                students++;
                if(students > b){
                    return false;
                }
                spc = ar[i];
            }
        }
        return true;
    }
    
    static int maxPage(int[] ar, int b){
            
            if(b>ar.length){
                return -1;
            }
            int l = ar[0], h = 0;
            
            for(int i=0;i<ar.length;i++){
                if(ar[i]<l){
                    l = ar[i];
                }
                h = h + ar[i];

            }
            int res = -1;
            while(l <= h){
                int m = (l+h)/2;
                if(isPossibleSol(ar,b,m) == true){
                    res = m;
                    h = m-1;
                }
                else{
                    l = m +1;
                }
            }
            return res;
        }
       
    public static void main(String[] args) {

        int ar[] = {12,34,67,90};
        int b = 2;
        System.out.println(maxPage(ar, b));
        
    }
}
