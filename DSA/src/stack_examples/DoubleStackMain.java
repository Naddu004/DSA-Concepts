package stack_examples;

import java.util.Scanner;

public class DoubleStackMain {
    public static void main(String[] args) {
        int ch;
        Scanner in=new Scanner(System.in);
        DoubleStack  obj=new DoubleStack ();
        System.out.println("Enter size of queue:");
        int size=in.nextInt();
        obj.create_stack(size);//user given size :stack
        do
        {
            System.out.println("\nStack Menu\n-----------------\n1.Push in First Stack\n2.Push in Second Stack\n3.Pop in First Stack\n4.Pop in Second Stack\n5.Peek in First Stack\n6.Peek in Second Stack\n7.Print Stack1\n8.Print Stack2\n0.Exit\n:");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                    if(!obj.is_full())//if not full then take data
                    {
                        System.out.println("Enter data to Push:");
                        int e=in.nextInt();
                        obj.push1(e);
                        System.out.println("Data to Pushed");
                    }
                    else {
                        System.out.println("Stack1 is Full");
                    }
                    break;
                case 2:
                    if(!obj.is_full())//if not full then take data
                    {
                        System.out.println("Enter data to Push:");
                        int e=in.nextInt();
                        obj.push2(e);
                        System.out.println("Data to Pushed");
                    }
                    else {
                        System.out.println("Stack2 is Full");
                    }
                    break;
                case 3:
                    if(!obj.is_empty1())//if not Empty then Pop
                    {
                        int e=obj.pop1();
                        System.out.println("Data Poped : "+e);
                    }
                    else
                    {
                        System.out.println("Stack1 is Empty");
                    }
                    break;
                case 4:
                    if(!obj.is_empty2())//if not Empty then Pop
                    {
                        int e=obj.pop2();
                        System.out.println("Data Poped : "+e);
                    }
                    else
                    {
                        System.out.println("Stack2 is Empty");
                    }
                    break;
                case 5:
                    if(!obj.is_empty1())//if not Empty then Peek
                    {
                        System.out.println("Data at Peek1 is : "+obj.peek1());
                    }
                    else
                    {
                        System.out.println("Stack1 is Empty");
                    }
                    break;
                case 6:
                    if(!obj.is_empty2())//if not Empty then Peek
                    {
                        System.out.println("Data at Peek2 is : "+obj.peek2());
                    }
                    else
                    {
                        System.out.println("Stack2 is Empty");
                    }
                    break;
                case 7:
                    if(!obj.is_empty1())//if not Empty then Print
                    {
                        obj.print_stack1();
                    }
                    else
                    {
                        System.out.println("Stack1 is Empty");
                    }
                    break;
                case 8:
                    if(!obj.is_empty2())//if not Empty then Print
                    {
                        obj.print_stack2();
                    }
                    else
                    {
                        System.out.println("Stack2 is Empty");
                    }
                    break;
                case 0:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;
            }
        }while(ch!=0);
    }
}