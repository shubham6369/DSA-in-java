public class StackExample {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        System.out.printlln(s.pop());
        System.out.printlln(s.peek());

    }
}

    class Stack {
    int[] stack;
    int top;
    int capacity;
    }

Stack(int capacity) {
    stack = new int[capacity];
    this.capacity = capacity;
    top = -1;
}

void push(int val) {
    if ( top == capacity -1) {
        System.out.println("Stack Overflow!");
    }
    stack[++top] = val;

} 

 void pop() {
    if (top == -1) {
        System.out.println("Stack Empty");
        return = -1;
    }
    int deleted = stack[top];
    top--;

    return deleted;

    int peek() {
        if (top == -1) {
            System.out.println("Stack Empty");
        }

    }
}