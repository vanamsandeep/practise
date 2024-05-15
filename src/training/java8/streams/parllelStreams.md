In Java 8, parallel streams provide a way to perform parallel processing on collections using the Stream API. Parallel streams can significantly improve the performance of operations that can be executed concurrently, such as bulk operations on large datasets. Here's how you can create and use parallel streams in Java 8:

1. **Creating Parallel Streams**:

You can create a parallel stream from any collection or array using the `parallelStream()` method:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> parallelStream = numbers.parallelStream();
```

2. **Performing Operations**:

Once you have a parallel stream, you can perform various operations on it just like you would with a sequential stream. For example:

```java
parallelStream.forEach(System.out::println); // Print each element of the stream
```

3. **Thread Safety**:

It's important to note that operations performed on parallel streams should be thread-safe. If you're performing mutable reduction (e.g., using `collect` with mutable accumulators), make sure that the accumulation function is thread-safe or use a concurrent data structure.

4. **Performance Considerations**:

Parallel streams are useful for large datasets and operations that can be divided into independent tasks. However, using parallel streams for small datasets or operations with high synchronization overhead might not yield performance benefits and could even lead to performance degradation due to the overhead of managing parallelism.

5. **Customizing Parallelism**:

You can customize the degree of parallelism (the number of threads used for processing) by setting the system property `java.util.concurrent.ForkJoinPool.common.parallelism`, or by explicitly specifying the parallelism when creating the stream:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> customParallelStream = numbers.parallelStream().parallel(); // Specify parallelism
```

6. **When to Use Parallel Streams**:

Parallel streams are beneficial when you have a large dataset and operations that can be performed independently on elements of that dataset. However, it's essential to benchmark and profile your application to ensure that parallel processing indeed improves performance and doesn't introduce any unintended side effects or overhead.

Overall, parallel streams are a powerful tool for concurrent processing in Java 8, but they should be used judiciously and with consideration for the characteristics of the data and the operations being performed.