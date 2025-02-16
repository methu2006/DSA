
import java.util.NoSuchElementException; //LIFO
public class BoundedArrayStack {
   
    private int maxSize; // Maximum size of the stack array
    private int[] Array; // Array to hold stack elements
    private int tos;     // Top of stack index

    // Constructor to initialize the stack
    public BoundedArrayStack(int s) {
        maxSize = s;          // Set array size
        Array = new int[maxSize]; // Initialize the array
        tos = -1;             // No items initially
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return tos == -1; // Stack is empty if the top index is -1
    }

    // Check if the stack is full
    public boolean isFull() {
        return tos == maxSize - 1; // Stack is full if the top index reaches max size
    }

    // Push operation
    public void push(int j) {
        // Check whether the stack is full
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        } else {
            Array[++tos] = j; // Increment top and insert item
        }
    }

    // Pop operation
    public int pop() {
        // Check whether the stack is empty
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        } else {
            return Array[tos--]; // Return the top element and decrement top
        }
    }

    // Peek operation to view the top element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        } else {
            return Array[tos]; // Return the top element
        }
    }

    // Print all stack elements from top to bottom
    public void print() {
        System.out.print("Stack elements: [");
        for (int i = tos; i >= 0; i--) { // Traverse from top to bottom
            System.out.print(Array[i] + " ");
        }
        System.out.println("]");
    }
}
 

