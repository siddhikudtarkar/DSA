package DSA;
public class Tilesplacement {
    
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int verticalplace = placeTiles(n-m,m);

        int horizontalplace = placeTiles(n-1,m);

        return verticalplace+horizontalplace;
    }
    public static void main(String[] args){
        int n=4,m=2;
        int totalplacements = placeTiles(n,m);
        System.out.println(totalplacements);
    }
}
    


