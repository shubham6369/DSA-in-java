public class LinkedListExample {
   public static void main(String[] args) {
      LinkedList list = new LinkedList();
      
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(50);
      list.add(45, 5);
        
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
             while(curr.next != null);{
               curr = curr.next;
      }

      curr.next = newNode;
   }
   
   void add(int data, int n) {
      Node newNode = new Node(data);

      if(n == 1){
         newNode.next = head;
         head = newNode;
         return;
      }

      for (int i = 1; i < n - 1; i++ ) {
         curr = curr.next;
      }
      if (curr != null);{
         return; 
      }
          newNode.next = curr.next;
         curr.next = newNode;
      }else{
         System.out.println("Invalid position");
      }   
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
}