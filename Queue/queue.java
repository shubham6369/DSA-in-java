public class QueueExample {

    public static void main (String[] args) {

    }
}
 class Queue {
    int queue[];
    int front;
    int rear;
    int size;
    int capacity;

    Queue(int size) {
        queue = new int[size];
        front = 0;
        rear = -1;
        size = 0;
    }
    void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue is full !");
            return;
        }
        queue
    

 }