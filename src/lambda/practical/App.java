package lambda.practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {

            List<Car> cars = Arrays.asList(
                new Car("Honda", "Accord", "Red", 22300),
                new Car("Toyota","Land Cruiser","White", 17700),
                new Car("Nissan","Sylpy","Blue", 18000)
            );


            /*version 1.0
             printCarsByColor(cars, "White");
            printCarsPriceRange(cars, 17900, 25000);
            */

            System.out.println();

            

            //Lambda version 2.0
            System.out.println("\nprinting cars in 17900 - 25000 range...");
            printCars(cars, (c) -> c.getPrice() >= 17900 && c.getPrice() <= 25000);
            // for singlre line we don't need the return if it was multiple lines we need return and {}
            // the c is from test(c) -> c.getPrice() >= 17900 && c.getPrice() <= 25000
            //test(Car c) method is the only method in the functinal interface and it mapps to this lambda

            //Lambda version 2.0
            System.out.println("\nprinting Blue cars...");
            printCars(cars, (c) -> c.getColor().equals("Blue"));
            
        }// end of main





//----------------------------------------



    //Predicate is the inbuilt Generic FunctionalInterface provided by java that has a method returns a boolean
    public static void printCars(List<Car> cars, Predicate<Car> condition){
        for(Car c: cars){
            if(condition.test(c)){
                c.printCar();
            }
        }
    }


//----------------------------------------






}
