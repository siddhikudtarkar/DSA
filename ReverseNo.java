package DSA;

import java.util.*;

public class ReverseNo {
    
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println(num);

    //int rev=0;
    //     while(num!=0){
    //         rev=rev*10+(num%10);
    //         num=num/10;

    //     }
    //     System.out.println(rev);
    // }

    // 
    
    StringBuilder sbl=new StringBuilder();
    sbl.append(num);
    StringBuilder rev=sbl.reverse();
    System.out.println(rev);
    sc.close();
}
}
