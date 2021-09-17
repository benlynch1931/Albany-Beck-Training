# Thread Interfaces


## What is Callable interface?

- It defines a target area for thread just like Runnable, but returns a value back to the caller

- Callable has `call()` which returns something back to the caller
```
  public <T> call() {

  }
```

- To get the return result, you can use the `Future` class
` Future<T> result = es.submit(c1);`
`result.get()` // This is a blocking call. The `get()` pauses execution until it receives a result
- We can put a time limit on the `get()` but passing the limit:
`result.get(5, TimeUnit.SECONDS)` // Waits 5 seconds, then terminates if no result  


**How can be run a callable interface's method `call()`?**

- We use `submit()` which is defined in ExecutorService

## What is Runnable interface?

- It defines a target area for thread, but doesn't return a value

- Runnable has `run()` which returns nothing [`void`]

- Run using `ExecutorService.execute()`
