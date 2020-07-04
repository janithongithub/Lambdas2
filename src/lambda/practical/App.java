package lambda.practical;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

            List<Car> cars = Arrays.asList(
                new Car("Honda", "Accord", "Red", 22300),
                new Car("Toyota","Land Cruiser","White", 17700),
                new Car("Nissan","Sylpy","Blue", 18000)
            );



        
        }

    public static void printCarsPriceRange( List<Car> cars, int low, int high){
        for( Car c: cars){
            if(low <= c.getPrice() && c.getPrice() <= high){
                c.printCar();
            }
        }
    }


    public static void printCarsByColor( List<Car> cars, String color){
        for( Car c: cars){
            if(c.getColor().equals(color)){
                c.printCar();
            }
        }
    }



}
