public class LinkedListExample {
   public static void main(String[] args) {
      LinkedList list = new LinkedList();
      
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(50);
        
        list.print();
   }
}

class LinkedList {
      class Node {
        int data;
        Node next;
         Node(int data) {
           this.data = data;
         }   
      }


   Node head;

   void add(int data ) {
      Node newNode = new Node(data);

      if (head == null) {
          head = newNode;
          return;
      }

      Node curr = head;
             while(curr.next != null){
               curr = curr.next;
      }

      curr.next = newNode;
   }
   
   void print(){
      Node curr = head;
      while (curr.next != null) {
         System.out.print(curr.data + " -> ");
         curr = curr.next;
      }
      System.out.println("null");   
   }
}   