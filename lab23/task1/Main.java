package ru.mirea.lab23.task1;

public class Main {
    public static void main(String[] args) {
        ArrayQueueModule queueModule = new ArrayQueueModule();
        testQueue(queueModule);

        ArrayQueueADT queueADT = new ArrayQueueADT();
        testQueue(queueADT);

        ArrayQueue queue = new ArrayQueue();
        testQueue(queue);
    }

    private static void testQueue(Queue queue) {
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i * 10);
        }

        System.out.println("Element at the front of the queue: " + queue.element());

        System.out.println("Current size of the queue: " + queue.size());

        System.out.println("Is the queue empty? " + queue.isEmpty());

        System.out.println("Dequeueing elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

        System.out.println("Current size of the queue after dequeue: " + queue.size());

        System.out.println("Is the queue empty after dequeue? " + queue.isEmpty());

        queue.clear();
        System.out.println("Queue cleared.");

        System.out.println("Current size of the queue after clear: " + queue.size());

        System.out.println("Is the queue empty after clear? " + queue.isEmpty());
    }
}
