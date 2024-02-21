package lesson11.Assignment;
import java.util.concurrent.CountDownLatch;

class OrderedTask implements Runnable {
    private final int threadId;
    private final CountDownLatch currentLatch;
    private final CountDownLatch nextLatch;

    public OrderedTask(int threadId, CountDownLatch currentLatch, CountDownLatch nextLatch) {
        this.threadId = threadId;
        this.currentLatch = currentLatch;
        this.nextLatch = nextLatch;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                currentLatch.await(); // Wait for the signal to proceed
                System.out.println("Thread " + threadId);
                nextLatch.countDown(); // Signal the next thread to proceed
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class Assignment13 {
    public static void main(String[] args) {
        // Create CountDownLatches with initial counts
        CountDownLatch latch1 = new CountDownLatch(1);
        CountDownLatch latch2 = new CountDownLatch(1);
        CountDownLatch latch3 = new CountDownLatch(1);

        // Create threads with signaling mechanism
        Thread thread1 = new Thread(new OrderedTask(1, latch1, latch2));
        Thread thread2 = new Thread(new OrderedTask(2, latch2, latch3));
        Thread thread3 = new Thread(new OrderedTask(3, latch3, latch1));

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Start the sequence by releasing the first thread
        latch1.countDown();

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