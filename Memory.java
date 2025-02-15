class SharedResource {
    int count = 0;
    volatile int count1 = 0;
    
    synchronized void increment() {
        count++;
        count1++;
    }
}

class Worker extends Thread {
    SharedResource resource;

    Worker(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            resource.increment(); // No synchronization
        }
    }
}

public class Memory {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();
        Thread t1 = new Worker(resource);
        Thread t2 = new Worker(resource);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Count: " + resource.count + resource.count1); // Unexpected value!
    }
}
