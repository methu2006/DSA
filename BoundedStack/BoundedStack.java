package boundedStack;

import java.util.NoSuchElementException;

public class BoundedStack {

    private int maxSize; // size of the stack array
    private int[] array; // array creation
    private int tos;     // top of the stack

    public BoundedStack(int s) {
        maxSize = s; // set array size
        array = new int[maxSize];
        tos = -1; // no items
    }

    // isEmpty method
    public boolean isEmpty() {
        return tos == -1; // stack is empty if the top is -1
    }

    // isFull method
    public boolean isFull() {
        return tos == maxSize - 1; // stack is full if the top reaches maxSize - 1
    }

    // push operation
    public void push(int j) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full.");
        } else {
            array[++tos] = j; // increment top and insert item
        }
    }

    // pop operation
    public int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        } else {
            return array[tos--]; // return item and decrement top
        }
    }

    // peek operation
    public int peek() {
        if (tos == -1) {
            throw new NoSuchElementException("Stack is empty");
        } else {
            return array[tos];
        }
    }

    // print all elements in the stack
    public void print() {
        System.out.print("Stack elements: [");
        for (int i = tos; i >= 0; i--) {
            System.out.print(array[i] + (i > 0 ? ", " : ""));
        }
        System.out.println("]");
    }

    // Main method for testing
    public static void main(String[] args) {
        BoundedStack stack = new BoundedStack(5); // Create a stack with capacity of 5

        System.out.println("Pushing elements onto the stack...");
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);

        stack.print(); // Display the stack elements

        System.out.println("\nPeeking top element: " + stack.peek());

        System.out.println("\nPopping elements...");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        stack.print(); // Display the stack elements after popping
    }
}
