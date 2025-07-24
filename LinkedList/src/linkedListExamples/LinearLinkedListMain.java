package linkedListExamples;

import entity.LinearLinkedList;
import java.util.Scanner;

public class LinearLinkedListMain {
    public static void main(String[] args) {
        int ch,e;
        Scanner in = new Scanner(System.in);
        LinearLinkedList list = new LinearLinkedList();
        list.createLinkedList();//user given size :list
        do
        {
            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List\n6.Search\n0.Exit\n:");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter data:");
                    e = in.nextInt();
                    list.insertLeft(e);
                    break;
                case 2:
                    System.out.println("Enter data:");
                    e = in.nextInt();
                    list.insertRight(e);
                    break;
                case 3:
                    list.deleteLeft();
                    break;
                case 4:
                    list.deleteRight();
                    break;
                case 5:
                    list.printLinkedList();
                    break;
                case 6:
                    System.out.println("Enter data:");
                    e = in.nextInt();
                    list.searchInList(e);
                    break;

                case 0:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;
            }
        }
        while (ch != 0);
    }
}

