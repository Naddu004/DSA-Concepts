package entity;

public class Queue {
    int front,rear,MaxSize,q[];

    void createqueue(int size)
    {
        front=0;
        rear=-1;
        MaxSize=size;
        q=new int[size];
    }

    void enqueue(int e)
    {
        rear++;
        q[rear]=e;
    }

    boolean isfull()
    {
        if(rear==MaxSize-1)
            return true;
        else
            return false;
    }
    int dequeue()
    {
        int temp=q[front];
        front++;
        return temp;
    }
    boolean isempty()
    {
        if(front>rear)
            return true;
        else
            return false;
    }
    void printqueue()
    {
        for(int i=front ;i<=rear ;i++)
            System.out.print(q[i]+"---");
    }
}