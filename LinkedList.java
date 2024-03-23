package DSA;
import java.util.*;
class LinkedList {
    Node head;
    private int size;

    LinkedList(){
        this.size=0;

    }
    class Node{
    String data;
    Node next;
    
    
    Node(String data){
        this.data = data;
        this.next = null;
        size++;
    }
}
    //add
    public void addFirst(String data){
       
       Node newNode = new Node(data);

       if(head == null){
       head = newNode;
       return;
       }

       newNode.next=head;
       head = newNode;

    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next!=null){
          currNode=currNode.next;

        }
        currNode.next=newNode;

    }

    //Delete
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }

    
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;

        }

        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public int getSize(){
        return size;
    }
    
    //print
    public void printList(){
    if(head==null){
        System.out.println("list is empty");
        return;
    }
    Node currNode = head;
    while(currNode!=null){
        System.out.print(currNode.data+"-->");
        currNode=currNode.next;
    }
    System.out.println("NULL");
    }
    
    
    public void reverseIterative(){
        if( head == null || head.next == null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;

        
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

        prevNode = currNode;
        currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
        
    }

  /*
    public Node reverseRecursive(Node head){
    if(head ==null || head.next==null ){
        return head;
    }
    
    Node newHead= reverseRecursive(head.next);
    head.next.next=head;
    head.next=null;

    return newHead;
    }*/
    public static void main(String [] args){
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("this");
        list.printList();

        //list.head=list.reverseRecursive(list.head);
        list.reverseIterative();
        
        // list.deleteFirst();
        list.printList();

        // list.deleteLast();
        // list.printList();

        // System.out.print(list.getSize());
    
}

// public static void main(String[] args){
//     LinkedList<String> list = new LinkedList<String>();
//     list.addFirst("a");
// }


}
