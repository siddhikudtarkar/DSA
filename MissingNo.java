public class MissingNo {
    public static void main(String[] args){
        int a[]={1,2,3,4,5,7,8,9,10};
        
        int sum1=0;
        for(int i=0;i<a.length;i++)
           {
            sum1=sum1+a[i];
        }
        System.out.println("Sum of elements in an array :" + sum1);

        int sum2 = 0;
        for(int i=1;i<=10;i++){
            sum2=sum2+i;
        }
        System.out.println("Sum of range of elements in an array :"+ sum2);
        System.out.println("Missing number is :" + (sum2-sum1));
    }
}
