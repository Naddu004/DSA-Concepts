package linkedListExamples;

import entity.StackUsingLinkedList;

import java.util.Scanner;

public class StackUsingLinkedlistMain {
    public static void main(String[] args) {
        StackUsingLinkedList listStk = new StackUsingLinkedList();
        Scanner sc = new Scanner(System.in);
        listStk.createStack();
        int ch;
        do{
            System.out.println("\nStack Menu\n-----------\n1.Push\n2.Pop\n3.Peek\n4.Print\n0.Exit\n:");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.print("Enter Data to Push in Stack : ");
                    int elmt = sc.nextInt();
                    listStk.push(elmt);
                    break;
                case 2:

            }
        }while (ch != 0);
    }
}
