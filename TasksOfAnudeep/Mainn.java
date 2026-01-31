package TasksOfAnudeep;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;

    
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

   
    public void appendList(MyLinkedList otherList) {
        if (otherList == null || otherList.head == null) {
            return; 
        }

        if (this.head == null) {
            this.head = otherList.head;
            return;
        }

      
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }

       
        temp.next = otherList.head;
    }

   
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Mainn {
    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList();
        list1.add(22); list1.add(33); list1.add(44); list1.add(55);

        MyLinkedList list2 = new MyLinkedList();
        list2.add(66); list2.add(77); list2.add(88); list2.add(99);

        System.out.print("List 1 before append: ");
        list1.display();

       
        list1.appendList(list2);

        System.out.print("List 1 after append:  ");
        list1.display();
    }
}