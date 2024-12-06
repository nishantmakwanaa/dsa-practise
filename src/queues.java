package src;

public class queues {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public queues(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(int item) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1)
                front = 0;
            queue[++rear] = item;
        }
    }

    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow");
        } else {
            front++;
        }
    }

    public void peek() {
        if (front != -1) {
            System.out.println("Front: " + queue[front]);
        } else {
            System.out.println("Queue Is Empty");
        }
    }

    public void printQueue() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}