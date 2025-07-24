import entity.StudentLinkedList;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentLinkedListMain {
    public static void main(String[] args) {
        StudentLinkedList records = new StudentLinkedList();
        records.createStudentLinkedList();

        Scanner sc = new Scanner(System.in);
        int ch;

        do{
            System.out.println("<----------Student Management System---------->");
            System.out.println("1.Add Record\n2.Search Record\n3.Print Records\n4.Update Record\n5.Remove Record\n0.Exit\n--->");
            ch = sc.nextInt();

            switch (ch){
                case 1:
                    System.out.print("Enter RollNo     : ");
                    int rollNo = sc.nextInt();
                    System.out.print("Enter Name       : ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter Gender M/F : ");
                    char gender = sc.next().charAt(0);
                    records.addStudentRecord(rollNo, name, gender);
                    break;
                case 2:
                    System.out.print("Enter RollNo of Record you want to Search : ");
                    rollNo = sc.nextInt();
                    records.searchRecord(rollNo);
                    break;
                case 3:
                    records.printRecords();
                    break;
                case 4:
                    System.out.print("Enter RollNo of Record you want to Update : ");
                    rollNo = sc.nextInt();
                    records.updateRecord(rollNo);
                    break;
                case 5:
                    System.out.print("Enter RollNo of Record you want to Delete : ");
                    rollNo = sc.nextInt();
                    records.removeRecord(rollNo);
                    break;
                case 0:
                    System.out.println("Thank You For Using our System.");
                    break;
                default:
                    System.out.println("Please Enter Valid Choice!");
            }
        }while(ch != 0);
    }
}
