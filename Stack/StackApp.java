public class StackApp {

    public static void main(String[] args) {
        // Create a stack with a maximum size of 5
        BoundedArrayStack theStack = new BoundedArrayStack(5);

        // Push operation
        for (int i = 1; i < 5; i++) { // Push values 10, 20, 30, 40
            if (!theStack.isFull()) {
                theStack.push(i * 10);
            } else {
                System.out.println("Cannot push. Stack is full.");
            }
        }

        // Print stack elements
        theStack.print();

        // Peek the top element
        if (!theStack.isEmpty()) {
            System.out.println("Top element is: " + theStack.peek());
        } else {
            System.out.println("Stack is empty, nothing to peek.");
        }

        // Pop operation
        if (!theStack.isEmpty()) {
            // Until the stack is empty, delete items from the stack
            int val = theStack.pop();
            System.out.println("Popped value: " + val);
            System.out.println(" ");
        } else {
            System.out.println("Cannot pop. Stack is empty.");
        }
    }
}


    

