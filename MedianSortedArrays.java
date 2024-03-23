public class MedianSortedArrays {
    
    public static float findMedian(int[] ar1,int[] ar2){
    
    int i=0,j=0,k=0;
    int[] m = new int[ar1.length+ar2.length];
    while(i<ar1.length && j<ar2.length && k<=(m.length/2)){
      if(ar1[i] < ar2[j]){
        m[k] = ar1[i];
        i++;
        k++;
      }
      else{
        m[k]=ar2[j];
        j++;
        k++;
      } 

    while(i<ar1.length&& k<=(m.length/2)){
        m[k] = ar1[i];
        i++;
        k++;
    }

    while(j<ar2.length && k<=(m.length/2)){
        m[k] = ar2[j];
        j++;
        k++;
    }

    if(m.length % 2 == 0){
        int mid = m.length/2;
        return (float)(m[mid] + m[mid-1])/2;
    }
    else{
        int mid = m.length/2;
        return m[mid];
    }
}
return -1;
 }

    public static void main(String[] args) {
        int[] ar1 = {1, 3, 8, 17};
        int[] ar2 = {5, 6 , 7, 19, 21, 25};
        System.out.println(findMedian(ar1 ,ar2));
    }
}
