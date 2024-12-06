package src;

public class stacks {
    private int[] stack;
    private int top;
    private int size;

    public stacks(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int item) {
        if (top < size - 1) {
            stack[++top] = item;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            top--;
        }
    }

    public void peek() {
        if (top != -1) {
            System.out.println("Top: " + stack[top]);
        } else {
            System.out.println("Stack Is Empty");
        }
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}