package entity;

public class LinearLinkedListForStack {
    Node tos;
    public void createLinkedList(){
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
        System.out.println(data + " Pushed in Stack.");
    }
    public void pop(){
        if(tos == null){
            System.out.println("Stack is Empty.");
        }
        else{
            Node t = tos;
            tos = tos.next;
            System.out.println(t.data + " Poped from Stack.");
        }
    }

    public void peek(){
        if(tos == null){
            System.out.println("Stack is Empty.");
        }
        else{
            System.out.println(tos.data + " is at Peek of Stack.");
        }
    }

    public void printStack(){
        if(tos == null){
            System.out.println("LinkedList is Empty.");
        }
        else{
            Node t = tos;
            while(t != null){
                System.out.print(t.data + "\n----");
                t = t.next;
            }
        }
    }
}
