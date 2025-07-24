package entity;

import java.util.Scanner;

public class StudentLinkedList {
    Node root;

    public void createStudentLinkedList(){
        root = null;
    }

    public void addStudentRecord(int rollNo, String name, char gender){
        Node n = new Node(rollNo, name, gender);
        if(root == null){
            root = n;
        }
        else{
            Node t = root;
            while(t.next != null){
                t = t.next;
            }
            t.next = n;
        }
        System.out.println("Record inserted Successfully.");
    }
    public void printRecords(){
        if(root == null){
            System.out.println("No Records are Present.");
        }
        else{
            Node t = root;
            while(t != null){
                System.out.println("RollNo  : " + t.rollNo);
                System.out.println("Name    : " + t.name);
                System.out.println("Gender  : " + t.gender);
                System.out.println("----------------------------------------------");
                t = t.next;
            }
        }
    }
    public void searchRecord(int rollNo){
        if(root == null){
            System.out.println("No Record is Present.");
        }
        else{
            Node t = root;
            while(t != null){
                if(t.rollNo == rollNo){
                    break;
                }
                t = t.next;
            }
            if(t != null){
                System.out.println("Record Found and Details are : ");
                System.out.println("RollNo  : " + t.rollNo);
                System.out.println("Name    : " + t.name);
                System.out.println("Gender  : " + t.gender);
                System.out.println("----------------------------------------------");
            }
            else{
                System.out.println("No Record is Present for given RollNo!");
            }
        }
    }
    public void updateRecord(int rollNo){
        if(root == null){
            System.out.println("No Record is Present.");
        }
        else{
            Node t = root;
            while(t != null){
                if(t.rollNo == rollNo){
                    break;
                }
                t = t.next;
            }
            if(t != null){
                Scanner sc = new Scanner(System.in);
                System.out.println("1.Update name\n2.Update Gender\n3.Update both Name and Gender\n");
                int num = sc.nextInt();
                if(num == 1){
                    System.out.print("Enter New Name : ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    t.name = name;
                    System.out.println("Name updated successfully.");
                }
                else if(num == 2){
                    System.out.print("Enter Gender M/F : ");
                    char gender = sc.next().charAt(0);
                    t.gender = gender;
                    System.out.println("Name updated successfully.");
                }
                else if(num == 3){
                    System.out.print("Enter New Name : ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter Gender M/F : ");
                    char gender = sc.next().charAt(0);
                    t.name = name;
                    t.gender = gender;
                    System.out.println("Name and Gender Updated Successfully.");
                }
                else{
                    System.out.println("Please choose only within 1 and 2.");
                }
            }
            else{
                System.out.println("No Record is Present for given RollNo!");
            }
        }
    }
    public void removeRecord(int rollNo){
        if(root == null){
            System.out.println("No Record is Present.");
        }
        else{
            if(root.rollNo == rollNo){
                root = root.next;
            }
            else{
                Node t = root;
                while(t.next != null){
                    if(t.next.rollNo == rollNo){
                        break;
                    }
                    t = t.next;
                }
                if(t.next != null){
                    t.next = t.next.next;
                }
                else{
                    System.out.println("No Record is Present for given RollNo!");
                }
            }
        }
    }
}

