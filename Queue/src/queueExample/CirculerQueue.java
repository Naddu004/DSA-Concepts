package queueExample;

public class CirculerQueue {
    int front,rear,maxSize,cnt,q[];

    void createCirculerQueue(int size)
    {
        front=0;
        rear=-1;
        cnt=0;
        maxSize=size;
        q=new int[size];
    }

    void enqueue(int e)
    {
        rear = (rear+1)%maxSize;
        q[rear]=e;
        cnt++;
    }

    boolean isfull()
    {
        if(cnt==maxSize)
            return true;
        else
            return false;
    }
    int dequeue()
    {
        int temp=q[front];
        front = (front+1)%maxSize;
        cnt--;
        return temp;
    }
    boolean isempty()
    {
        if(cnt == 0)
            return true;
        else
            return false;
    }
    void printqueue()
    {
        int i=front;
        int c=0;
        while(c<cnt)
        {
            System.out.print(q[i]+"---");
            i=(i+1)%maxSize;
            c++;
        }
    }
}

