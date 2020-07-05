package lambda.practical;

@FunctionalInterface
public interface CarCondition<T> {
    public boolean test(T t);
    
}