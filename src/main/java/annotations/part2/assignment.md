# Proxying like a Spring

In this exercise we will write an annotation on class level. This annotation indicates if a class needs to be a proxy or
not. It will still use `@Timed` annotation from part1.

## Step 1: Add a new annotation called @EnableTiming

Create a new annotation called `@EnableTiming` in the `day1.annotations` package. The annotation should only be used on the type level. For example the `EmailServiceImpl`.

## Step 2: Implement the missing code in `BeanFactory` class

Now create a `ProxyFactory` class which can be used to create a proxy instances of classes annotated
with `@EnableTiming`.
The proxy class should look for `EnabledTiming` annotations at the class level and create proxies for those services.

Now run the `Main` class and check that the execution time is logged.


## Step 3: Can you make the `beanRegistry` in `BeanFactory` generic?


## Hints

To instantiate a class using reflection you can use the following code:

```
House house = (House) Class.forName("constructs.House").getDeclaredConstructors()[0].newInstance(new PositiveNumber(1), new PositiveNumber(1));
```

```
House.class.getAnnotation(EnableTiming.class);
```

```
public class Cache<T> {
    private final Map<String, T> cache = new HashMap<>();

    public T get(String key) {
        return cache.get(key);
    }

    public void put(String key, T value) {
        cache.put(key, value);
    }
}
```
