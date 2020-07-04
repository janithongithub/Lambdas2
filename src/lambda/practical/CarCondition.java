package lambda.practical;

@FunctionalInterface
public interface CarCondition {
    public boolean test(Car c);
    
}