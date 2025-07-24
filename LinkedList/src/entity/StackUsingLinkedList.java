package entity;

public class StackUsingLinkedList {
    Node tos;

    public void createStack(){
        tos = null;
    }

    public void push(int data){
        Node n = new Node(data);
        if(tos == null){
            tos = n;
        }
        else{
            n.next = tos;
            tos = n;
        }
        System.out.println("");
    }
}
