
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PlatformThreads {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 20; i++) {
            int taskId = i;

            executor.submit(() -> {
                try {
                    Thread.sleep(1000); // simulate API delay
                    System.out.println("Platform Thread Task " + taskId);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executor.shutdown();

        while (!executor.isTerminated()) {}

        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + " ms");
    }
}
