package org.example.queue;

public class QueueMain {

    public void allTheQueueFunctions(){
        Queue queue = new Queue(5);
        queue.enqueue(11);
        queue.enqueue(13);
        System.out.println("After adding nodes to the list: ");
        queue.printQueue();
        System.out.println("After removing first node from the list: ");
        queue.dequeue();
        queue.printQueue();
        queue.getFirst();
        queue.getLast();
        queue.getLength();

        MyQueue myQueue = new MyQueue();
        System.out.println("Queue Using Stacks: Enqueue");
        myQueue.enqueueWithTwoStack(8);
        myQueue.enqueueWithTwoStack(11);
        myQueue.enqueueWithTwoStack(6);
        myQueue.printQueue();

        System.out.println("Dequeue Using Stacks: ");
        myQueue.dequeueUsingStack();
        myQueue.printQueue();

    }
}
