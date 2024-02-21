package lesson11.Assignment;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class OrderedTask implements Runnable {
    private final int threadId;
    private final CyclicBarrier barrier;

    public OrderedTask(int threadId, CyclicBarrier barrier) {
        this.threadId = threadId;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread " + threadId);
                barrier.await(); // Wait for other threads to reach the barrier
            }
        } catch (InterruptedException | BrokenBarrierException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class test {
    public static void main(String[] args) {
        // Create a CyclicBarrier with the number of threads
        int numberOfThreads = 3;
        CyclicBarrier barrier = new CyclicBarrier(numberOfThreads);

        // Create threads with the signaling mechanism
        Thread thread1 = new Thread(new OrderedTask(1, barrier));
        Thread thread2 = new Thread(new OrderedTask(2, barrier));
        Thread thread3 = new Thread(new OrderedTask(3, barrier));

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

