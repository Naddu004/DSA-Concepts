package entity;

public class CirculerLinkedList {
    Node root,last;
    public void createLinkedList(){
        root = last =null;
    }
    public void insertLeft(int data) {
        Node n = new Node(data);
        if (root == null && last == null) {
            root = last = n;
            last.next = root;
        }
        else{
            n.next = root;
            root = n;
            last.next = root;
        }
        System.out.println(data + " Left side inserted in CircularLinkedList.");
    }
    public void deleteLeft(){
        if(root == null && last == null){
            System.out.println("List is Empty.");
        }
        else {
            if(root == last){
                root = last = null;
            }
            else{
                Node t = root;
                root = root.next;
                last.next = root;
                System.out.println(t.data + " Deleted from CircularLinkedList.");
            }
        }
    }
    public void insertRight(int data){
        Node n = new Node(data);
        if(root == null && last == null){
            root = last = n;
            last.next = n;
        }
        else{
            last.next = n;
            last = n;
            last.next = root;
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
        if(root == null && last == null){
            System.out.println("List is Empty.");
        }
        else{
            Node t = root;
            Node t2 = root;
            /*
            while(t.next != last){
                t = t.next;
            }
            int data = t.next.data;
            */
            while(t.next != root){
                t2 = t;
                t = t.next;
            }
            if(t == root){
                root = last = null;
            }
            else{
                last = t2;
                last.next = root;
            }
            System.out.println(t.data + " Deleted from right side of LinkedList.");
        }
    }
    public void printLinkedList(){
        if(root == null){
            System.out.println("LinkedList is Empty.");
        }
        else{
            Node t = root;
            do{
                System.out.print("|" + t.data + "|-->");
                t = t.next;
            }while(t != root);
        }
    }
}

