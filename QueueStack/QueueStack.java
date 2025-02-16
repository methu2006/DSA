import java.util.LinkedList;
import java.util.Queue;

public class QueueStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    
    public QueueStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push element onto the stack
    public void push(int data) {
        queue1.add(data);
    }

    // Pop element from the stack
    public int pop() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        
        // Move all elements except the last one from queue1 to queue2
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        // The last element in queue1 is the top of the stack
        int topElement = queue1.remove();

        // Swap queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    @Override
    public String toString() {
        return queue1.toString();
    }

    // Test the QueueStack
    public static void main(String[] args) {
        QueueStack stack = new QueueStack();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack after pushes: " + stack);  

        System.out.println("Popped: " + stack.pop());  
        System.out.println("Stack after pop: " + stack);  

        stack.push(4);
        System.out.println("Stack after pushing 4: " + stack);  

        System.out.println("Popped: " + stack.pop()); 
        System.out.println("Stack after pop: " + stack);  
    }
}
