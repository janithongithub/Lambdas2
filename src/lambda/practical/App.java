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


            /*version 1.0
             printCarsByColor(cars, "White");
            printCarsPriceRange(cars, 17900, 25000);
            */
            printCars(cars, new CarCondition(){
                @Override
                public boolean test(Car c) {
                    return c.getPrice() >= 17900 && c.getPrice() <= 25000;
                    
                }
            });

            printCars(cars, new CarCondition(){
                @Override
                public boolean test(Car c) {
                    return c.getColor().equals("Blue");
                    
                }
            });


            //Lambda version 2.0
            printCars(cars, (c) -> c.getPrice() >= 17900 && c.getPrice() <= 25000);
            // for singlre line we don't need the return if it was multiple lines we need return and {}
            // the c is from test(c) -> c.getPrice() >= 17900 && c.getPrice() <= 25000
            //test(Car c) method is the only method in the functinal interface and it mapps to this lambda

            //Lambda version 2.0
            printCars(cars, (c) -> c.getColor().equals("Blue"));
            
        }// end of main





//----------------------------------------


        // printcars(cars, condition)
    public static void printCars(List<Car> cars, CarCondition condition){
        for(Car c: cars){
            if(condition.test(c)){
                c.printCar();
            }
        }
    }


//----------------------------------------









/*              version 1.0
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
*/


}
