package queueExample;

import java.util.Scanner;

public class CircularQueueMain {
    public static void main(String args[])
    {
        Queue obj=new Queue();
        Scanner in =new Scanner(System.in);
        System.out.println("Enter stack size:");
        int size=in.nextInt();
        obj.createqueue(size);
        int ch;
        do
        {
            System.out.println("\nQueue Menu\n----------------\n1.Enquque\n2.Dequeue\n3.Print Queue\n0.Exit\n:");
            ch=in.nextInt();
            switch (ch)
            {
                case 1:
                    if(obj.isfull()!=true)//not full
                    {
                        System.out.println("Enter data:");
                        int e=in.nextInt();
                        obj.enqueue(e);
                        System.out.println(e+" Enqueued");
                    }
                    else
                        System.out.println("Queue is FUll");
                    break;
                case 2:
                    if(obj.isempty()!=true)//not empty
                    {
                        System.out.println(obj.dequeue()+" Dequeued");
                    }
                    else
                        System.out.println("Queue is Empty");
                    break;
                case 3:
                    if(obj.isempty()!=true)//not empty
                    {
                        System.out.println("Queue has");
                        obj.printqueue();
                    }
                    else
                        System.out.println("Queue Empty");
                    break;
                case 0:
                    System.out.println("Thanks for using code");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;
            }
        }while(ch!=0);//not with exit condition
    }
}
