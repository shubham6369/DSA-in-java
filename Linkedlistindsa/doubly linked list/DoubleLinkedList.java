public class DoublyLinkedList {

    public static void main(String[]args)

}

class LinkedList











    Node head;

    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        
        curr.next = newNode;
        newNode.prev = 

    }



