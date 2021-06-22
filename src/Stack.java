public class Stack {
    private final int MAX = 1000;
    private final int[] storage;
    private int topIndex;

    public Stack() {
        storage = new int[MAX];
        topIndex = -1;
    }

    void push(int num) {
        if (topIndex >= MAX - 1) {
            System.err.println("Stack Overflow");
        } else {
            topIndex++;
            storage[topIndex] = num;
        }
    }

    int pop() {
        if (topIndex < 0) {
            System.err.println("Stack Underflow");
            return 0;
        } else {
            int poppedVal = storage[topIndex];
            topIndex--;
            return poppedVal;
        }
    }

    boolean isEmpty() {
        return (topIndex < 0);
    }

    int peek() {
        return storage[topIndex];
    }
}

class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
    }
}
