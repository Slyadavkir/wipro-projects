import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreads {

    public static void main(String[] args) {

        Runnable task = () -> System.out.println("hello thread is working!");

        // Normal thread
        Thread t = new Thread(task);
        t.start();

        // Creating multiple threads
        for (int i = 1; i <= 10; i++) {
            int num = i;

            new Thread(() -> 
                System.out.println("New thread is created! " + num)
            ).start();
        }

        // Thread pool (instead of virtual thread executor)
        ExecutorService service = Executors.newFixedThreadPool(5);

        service.submit(() -> System.out.println("Task via ExecutorService"));

        service.shutdown();
    }
}