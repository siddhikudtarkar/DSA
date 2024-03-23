package DSA;
public class PrimeNo1 {
        public static void main(String[] args) {
            int n=4;
            int temp=0;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    temp+=1;
                }
            }
            if(temp==0){
                System.out.println("prime no");
            }
            else{
                System.out.println("not a prime no");
            }
        }
        }

