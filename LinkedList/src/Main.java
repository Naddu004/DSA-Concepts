//import entity.LinearLinkedList;
//import entity.Node;
//import entity.Stack;
//
//public class Main {
//    public static void main(String[] args){
//        LinearLinkedList l1 = new LinearLinkedList();
//        l1.createLinkedList();
//        l1.insertLeft(2);
//        l1.insertLeft(4);
//        l1.insertLeft(3);
//
//        LinearLinkedList l2 = new LinearLinkedList();
//        l2.createLinkedList();
//        l2.insertLeft(5);
//        l2.insertLeft(6);
//        l2.insertLeft(4);
//
//        LinearLinkedList list = new LinearLinkedList();
//        list = addTwoNumbers(l1, l2);
//        list.printLinkedList();
//    }
//    public static LinearLinkedList addTwoNumbers(LinearLinkedList l1, LinearLinkedList l2) {
//        Stack st = new Stack();
//        st.createStack(10);
//        LinearLinkedList list = new LinearLinkedList();
//        list.createLinkedList();
//        while(!l1.isEmpty()){
//            st.push(l1.deleteLeft());
//        }
//        int num1 = 0;
//        while(!st.isEmpty()){
//            num1 = num1*10 + st.pop();
//        }
//        while(!l2.isEmpty()){
//            st.push(l2.deleteLeft());
//        }
//        int num2 = 0;
//        while(!st.isEmpty()){
//            num2 = num2*10 + st.pop();
//        }
//        int ans = num1 + num2;
//        while(ans != 0){
//            list.insertRight(ans%10);
//            ans /= 10;
//        }
//        return list;
//    }
//}