package DSA;
public class CountPaths{

    public static int printPaths(int i,int j,int n,int m){
        if(i==n||j==m){
            return 0;
        }
        if(i==n-1||j==m-1){
            return 1;
        }
        int downPaths = printPaths(i+1,j,n,m);

        int rightPaths = printPaths(i,j+1,n,m);

        return downPaths+rightPaths;
    }
    public static void main(String[] args){
        int n=3,m=3;
        int totalPaths = printPaths(0,0,n,m);
        System.out.println(totalPaths);
    }
}
    

