import java.util.concurrent.*;

class ESDemo {

  public static void main(String[] args) {

    // Create an ExecutorService object

    // Can check how many cores the machine has
    ExecutorService es = Executors.newFixedThreadPool(4);

    Runnable r1 = new Runnable() {
      @Override
      public void run() {
        System.out.println("Run() method is running in r1");
      }

    };

    Runnable r2 = () -> System.out.println("Run() method is running in r2");

    es.execute(r1);
    es.execute(r2);
    es.execute(() -> System.out.println("Inline with execute method"));


    Callable<String> c1 = new Callable<>() {

      @Override
      public String call() {
        return "This is from callable method";
      }
    };

    // es.execute(c1); // INVALID: Error

    // Asynchronous
    Future<String> result = es.submit(c1);
    try {
      // The `get()` method will wait for the result if it is not there. We have told it to wait for 5 seconds, then terminate if no result
      // It is a block method. It will stop execution of conde until it has the result
      System.out.println(result.get(5, TimeUnit.SECONDS));
    } catch (InterruptedException | ExecutionException | TimeoutException e) {
      System.out.println(e);
    }

    es.shutdown(); // No more tasks accepted

  }
}
