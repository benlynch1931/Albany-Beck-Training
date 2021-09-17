# Multi-Threading

- This skill is on demand

- Only write multi-threaded programs if it is suitable to the problem


### What is a process?

- A program under execution
- A program which has received CPU time

### What is multi-tasking

- Performing more than one task concurrently

- **Types of Multi-Tasking*:

  1. Process-Based (Multiple Applications/Programs)

```
    Ex:

    Process 1 - M1 (Memory Location)

    Process 2 - M2 (Memory Location)
```
  - Heavy-weight approach
  - Context Switching is complex
    - Switching from one memory location to another


  2. Thread-Based (Single Application/Program)

    - A thread is a part of a program, which is used to complete a task
      - Every thread has its *own* call stack
    - A program may contain one or more threads and they run at same memory location.

    - Light-weight approach
    - Context Switching is simple


### Why Multi-Threading

- To improve the performance of application by utilising multiple CPU cores
- Reduce the idle-time of CPU because threads may run on multiple CPU cores


### What is throughput?

- It indicates percentage of idle time of CPU.


### How can we create threads?

- Threads can be created by one of the options given below:
(Legacy Options)
  1. By extending `Thread` Class and overriding `run()` method

  2. By implementing `Runnable` interface and overriding `run()` method
    - `extend` still open
(Java5+)
  3. ExecutorService
(Java7+)
  4. Fork-Join framework
(Java8+)
  5. Java Streams()


Thread Objects newly created are in `New state`. They are not eligible for CPU time until they are `Ready` or `Runnable`


### Prioritising Threads

If there is a thread with P6 (Priority 6) running, and a thread with P9 is `runnable`. The Scheduler will `yield()` the P6 thread and pass the CPU time to P9 thread.



### Methods of built-in thread class

1. run()
2. start()
3. sleep() - static
4. yield()
5. currentThread() - static
6. getName()
7. setName(String)
8. setPriority(Int[1-10])
9. getPriority()
10. join() ->


### How threads can communicate in Java

- Object class provides methods like:

  wait(), notify(), notifyAll() to help the Java threads to communicate

  wait() will wait for another thread, this other thread must notify() to tell first thread to continue.


- When two or more threads access same target, threads may lead to asynchronous state.

  1. This has to be controlled by using the method specifier `synchronized` when declaring a method

  `public synchronized int add(int a, int b);``

  2. Creating a `synchronous` block

  ```
    public int add(int a, int b) {

      int c = 0;

      synchronized(this) {
        c = a + b
      }

    }
  ```


### Challenges associated with multi-threading in Java

1. Race-condition

  Two or more threads are in `race` to access a method or block.
  We can avoid this by considering:
    - `synchronized` methods or blocks.
    - Re-entrant locks


2. Starvation
  i.e. `downloading a game while playing another.. Download takes all bandwidth`
  - Write appropriate which avoids a thread being too greedy (time restriction)


3. LiveLock
  i.e. `getting stuck in a doorway... Who goes through first?`

  Doing the same job without progressing.
  Requires communication between threads to allow one to progress before the other.

  - If a thread expects a notification from other thread to proceed.

  - Write appropriate code which sends notification to other threads when they are in LiveLock

4. DeadLock
  i.e. `nested synchronized blocks`

  When threads are waiting for resources which are mutually blocked

  ```
    Thread 1 // Can't do obj2 until T2 released obj2, but T2 can't do that until T1 releases obj1

    synchronized(obj1) {
      synchronized(obj2) {

      }
    }

    Thread 2 // Can't do obj1 until T1 released obj1, but T1 can't do that until T2 releases obj2

    synchronized(obj2) {
      synchronized(obj1) {

      }
    }
  ```

### ExecutorService

- used to run threads

- Create ExecutorService object passing number of threads to create
  `ExecutorService es = Executors.newFixedThreadPool(4);`

- For Runnable, use: `es.execute(r1);`
- For Callable, use: `es.submit(c1);`

- ExecutorService will *not* shutdown automatically, it will continue to wait for new tasks.

- To shut down ExecutorService, use: `es.shutdown();`


### What is the difference between `Future` and `CompletableFuture`?

### What is CyclicBarrier?

### What is concurrent collection classes?

- Classes that support concurrent programming/execution

-> ConcurrentHashMap

-> CopyOnWriteArrayList
  - Creates new object for each `add()` -> uses Heap Memory
