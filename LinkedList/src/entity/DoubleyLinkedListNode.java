package entity;

public class DoubleyLinkedListNode {
    DoubleyLinkedListNode previous;
    int data;
    DoubleyLinkedListNode next;
    DoubleyLinkedListNode(int data){
        this.data = data;
        previous = null;
        next = null;
    }
}
