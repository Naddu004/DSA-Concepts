package entity;

public class ReverceLinkedList {
    public static void main(String[] args) {
        Stack stk = new Stack();
        LinearLinkedList list = new LinearLinkedList();

        stk.createStack(10);
        list.createLinkedList();

        list.insertRight(10);
        list.insertRight(20);
        list.insertRight(30);
        list.insertRight(40);
        list.insertRight(50);

        list.printLinkedList();

        Node t = list.getRoot();

        while(t != null){
            stk.push(t.data);
            t = t.next;
        }

        t = list.getRoot();

        while(t != null){
            t.data = stk.pop();
            t = t.next;
        }

        list.printLinkedList();
    }
}
