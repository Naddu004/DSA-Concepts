package entity;

public class DoubleyLinkedList {
    DoubleyLinkedListNode root;
    public void createLinkedList(){
        root =null;
    }
    public void insertLeft(int data) {
        DoubleyLinkedListNode n = new DoubleyLinkedListNode(data);
        if (root == null) {
            root = n;
        }
        else{
            n.next = root;
            root.previous = n;
            root = n;
        }
        System.out.println(data + " Left side inserted in DoubleyLinkedList.");
    }
    public void deleteLeft(){
        if(root == null){
            System.out.println("List is Empty.");
        }
        else {
            DoubleyLinkedListNode t = root;
            if(root.previous == null && root.next == null){
                root = null;
            }
            else{
                root = root.next;
            }
            System.out.println(t.data + " Deleted from CircularLinkedList.");
        }
    }
    public void insertRight(int data){
        DoubleyLinkedListNode n = new DoubleyLinkedListNode(data);
        if(root == null){
            root = n;
        }
        else{
            DoubleyLinkedListNode t = root;
            while(t.next != null){
                t = t.next;
            }
            t.next = n;
            n.previous = t;
        }
        System.out.println(n.data + " right side inserted in LinkedList.");
    }

    /*
        public void deleteRight(){
            if(root == null){
                System.out.println("List is Empty.");
            }
            else{
                if(root.next == null){
                    root = null;
                }
                Node t = root;
                Node t2 = root;
                while(t.next != null){
                    t2 = t;
                    t = t.next;
                }
                t2.next = null;
                System.out.println(t.data + " Deleted from right side of LinkedList.");
            }
        }
    */
    public void deleteRight(){
        if(root == null){
            System.out.println("List is Empty.");
        }
        else{
            DoubleyLinkedListNode t = root;
            while(t.next != null){
                t = t.next;
            }
            if(t == root){
                root = null;
            }
            else{
                DoubleyLinkedListNode t2 = t.previous;
                t2.next = null;
            }
            System.out.println(t.data + " Deleted from right side of LinkedList.");
        }
    }
    public void RevercePrintLinkedList(){
        if(root == null){
            System.out.println("LinkedList is Empty.");
        }
        else{
            DoubleyLinkedListNode t = root;
            while(t.next != null){
                t = t.next;
            }
            while (t != null){
                System.out.print("|" + t.data + "|-->");
                t = t.previous;
            }
        }
    }
}
