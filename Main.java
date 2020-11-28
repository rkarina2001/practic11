package exercise;

public class Main {
    public static void main(String[] args){
        ArrayQueue arrayQueue = new ArrayQueue();
        for (int i = 1; i <= 10; i++) {
            arrayQueue.enqueue(i);
        }
        System.out.print("Queue: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(arrayQueue.dequeue() + " ");
        }

        System.out.println();

        ArrayQueueADT arrayQueueADT = new ArrayQueueADT();
        for (int i = 0; i <= 10; i++) {
            ArrayQueueADT.enqueue(arrayQueueADT, i);
        }
        System.out.print("Dequeue: ");
        for (int i = 0; i <= 10; i++) {
            System.out.print(ArrayQueueADT.dequeue(arrayQueueADT) + " ");
        }

        System.out.println();

        LinkedQueue linkedQueue = new LinkedQueue();
        for (int i = 0; i <= 10; i++) {
            linkedQueue.enqueue(i);
        }
        System.out.print("LinkedQueue: ");
        for (int i = 0; i <= 10; i++) {
            System.out.print(linkedQueue.dequeue() + " ");
        }
    }
}
