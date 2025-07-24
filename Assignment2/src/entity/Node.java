package entity;

public class Node {
    int rollNo;
    String name;
    char gender;
    Node next;
    public Node(int rollNo, String name, char gender){
        this.rollNo = rollNo;
        this.name = name;
        this.gender = gender;
        next = null;
    }
}
