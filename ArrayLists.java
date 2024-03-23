package DSA;
import java.util.*;
public class ArrayLists {
    public static void main (String[] args){

        ArrayList<Integer> lists = new ArrayList<Integer>();
        
        //add ele
        lists.add(0);
        lists.add(1);
        lists.add(2);
        lists.add(3);
        System.out.println(lists);

        //get ele
        int ele =lists.get(0);
        System.out.println(ele);

        // add ele in between
        lists.add(1,1);
        System.out.println(lists);

        //set element
        lists.set(0,5);
        System.out.println(lists);

        //delete element
        lists.remove(3);
        System.out.println(lists);

        //size
        System.out.println(lists.size());

        //loops
        for(int i=0;i<lists.size();i++){
        System.out.println(lists.get(i));
        }
        //sort
        Collections.sort(lists);
        System.out.println(lists);
       
    }
}
