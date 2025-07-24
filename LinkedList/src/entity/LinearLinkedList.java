package entity;

public class LinearLinkedList {
    Node root;
    public void createLinkedList(){
        root = null;
    }
    public void insertLeft(int data){
        Node n = new Node(data);
        if(root == null){
            root = n;
        }
        else{
            n.next = root;
            root = n;
        }
        System.out.println(data + " left side inserted in LinkedList.");
    }
    public void deleteLeft(){
        if(root == null){
            System.out.println("List is Empty.");
        }
        else{
            Node t = root;
            root = root.next;
            System.out.println(t.data + " Deleted from left side of LinkedList.");
        }
    }
    public void insertRight(int data){
        Node n = new Node(data);


        if(root == null){
            root = n;
        }
        else{
            Node t = root;
            while(t.next != null){
                t = t.next;
            }
            t.next = n;
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
            if(root.next == null){
                root = null;
            }
            Node t = root;
            while(t.next.next != null){
                t = t.next;
            }
            t.next = null;
            System.out.println(t.data + " Deleted from right side of LinkedList.");
        }
    }
    public void printLinkedList(){
        if(root == null){
            System.out.println("LinkedList is Empty.");
        }
        else{
            Node t = root;
            while(t != null){
                System.out.print("|" + t.data + "|-->");
                t = t.next;
            }
        }
    }
    public void searchInList(int key){
        if(root == null){
            System.out.println("LinkedList is Empty.");
        }
        else{
            Node t = root;
            while(t != null){
                if(t.data == key){
                    System.out.println("Found in LinkedList.");
                }
                t = t.next;
            }
            if(t == null){
                System.out.println("Not Founf in LinkedList.");
            }
        }
    }
    public void deleteSpecific(int key){
        if(root == null){
            System.out.println("List is Empty.");
        }
        else{
            Node t = root;
            Node t2 = root;
            while(t != null){
                if(t.data == key){
                    System.out.println(t.data + " Found in LinkedList.");
                    break;
                }
                t2 = t;
                t = t.next;
            }
            if(t == null){
                System.out.println("Not Found in LinkedList.");
            }
            else{
                if(t == root){
                    root = root.next;
                }
                else if(t.next == null){
                    t2.next = null;
                }
                else{
                    t2.next = t.next;
                    t.next = null;
                }
                System.out.println(t.data + " deleted from LinkedList.");
            }
        }
    }
    public void insertSpecific(int index,int data){
        if(root==null)
            System.out.println("List empty");
        else
        {
            if(index==0)
            {
                Node n=new Node(data);
                n.next=root;
                root=n;
            }
            else
            {
                Node t=root;
                Node t2=root;
                int i=0;
                while(t!=null && index>0)
                {
                    t2=t;
                    t=t.next;
                    index--;
                }
                if(t==null)
                    System.out.println("Index out of range");
                else
                {
                    Node n=new Node(data);
                    t2.next=n;
                    n.next=t;
                }
                System.out.println(data+"inserted");
            }
        }
    }
    public Node getRoot(){
        return root;
    }
    public boolean isEmpty(){
        return root == null;
    }
}
