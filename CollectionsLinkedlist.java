package DSA;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
class CollectionsLinkedlist{
public static void main(String[] args){
//     LinkedList<Integer> list = new LinkedList<Integer>();
    // list.addFirst("a");
    // list.addFirst("is");
    // list.add("list");
    // System.out.println(list);
    // System.out.println(list.size());

    // for(int i=0;i<list.size();i++){

    //     System.out.print(list.get(i)+"-->");
    // }
    // System.out.println("null");

    // // System.out.println(list.removeFirst());
    // // System.out.println(list);
   
    // // System.out.println(list.removeLast());
    // // System.out.println(list);

    //  list.remove(2);
    //  System.out.println(list);

    // list.add(1);
    // list.add(5);
    // list.add(7);
    // list.add(3);
    // list.add(8);
    // list.add(2);
    // list.add(3);
    
    // // for(int i=0;i<list.size();i++){
        
    // //     if(list.get(i)==7){
    // //         System.out.println(i);
    // //     }
    // }
    
   
        Scanner scanner = new Scanner(System.in);

        // Create a LinkedList to store numbers
        LinkedList<Integer> numberList = new LinkedList<>();

        // Take input from the user for the number of elements in the list
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Take input for each element in the list
        System.out.println("Enter numbers in the range of 1-50:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();

            // Check if the number is in the valid range (1-50) before adding to the list
            if (number >= 1 && number <= 50) {
                numberList.add(number);
            } else {
                System.out.println("Please enter a number in the range of 1-50. Try again.");
                i--; // Decrement i to re-enter the current index
            }
        }

        // Print the original list
        System.out.println("Original LinkedList: " + numberList);

        // Use an iterator to remove elements greater than 25
        ListIterator<Integer> iterator = numberList.listIterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            if (value > 25) {
                iterator.remove();
            }
        }

        // Print the modified list
        System.out.println("Modified LinkedList: " + numberList);
    }
}
