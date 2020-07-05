Functional interface** 

Interface with only one abstract method

abstract - unimplemented

**Lambdas are blocks of code used to implement the single abstract method defined by a functional interface**



use **@FunctionaInterface** annotation as a convention( Good practice )

```java
@FunctionaInterface
public interface Walkable{

​	public void walk();

}
```

Main

```java
Walakable aBlockOfCode = () -> { //implementation of abstract method walk() here
                               };

aBlockOfCode.walk();		// this invokes above defined Lambda 	() -> { } 
```

`Walkable` type is an interface, so `aBlockOfCode` is variable reference to `Walkable` interface.





Another important point

```java
@FunctionalInterface
public interface Calculate{
	public int compute(int arg1, int arg2);

}
```

Main

```java
Calculate cal = (a, b) -> a+b;


cal.compute(4, 7);	// invoke the above defined Lambda (a,b) -> a+b;
```

 we dont even need a return statement 	`(a,b) ->`  **return**   `a+b;`

Lambda expression is smart enough to know the return is an `int`

 

Main

```java
Calculate dv = (a,b) -> { if (a == 0) return 0;
                              return a/b;
                        };

dv.compute(10,5);//invoke the above defined Lambda	
								//	(a,b) -> { if (a == 0) return 0;
             		//              return a/b; 
                //            }
```

**This Lmbda is also using the Calculate functional interface as it accepts 2 arguments implemented different lambda for same functional interface**

There are plenty of built in functional intrefaces we can use in our program provided by java



##### Can we make functional interfaces Generic? absolutely

```java
public interface myGenericInterface<T,T> {
  public T myGenric1ArgMethod(T t1,T t2);
}

Calculate<Integer> dv = (a,b) -> { if (a == 0) return 0;
                              return a/b;
                        };
```







```java
@FunctionalInterface
public interface MyGenericInterface<T> {
    public T compute(T t);
}
```

```java
public interface MyGenericInterface2<T> {
    public T compute(T arg1, T arg2);
}

```

```java
    public static void main(String[] args) {

        MyGenericInterface<Integer> dv = (Integer n) ->{   return n+n;  };
        System.out.println(dv.compute(34));


        MyGenericInterface2<Integer> dv2 =
                                (Integer n1, Integer n2) -> {
                                        return n1 + n2;
                                };
        System.out.println(dv2.compute(23,12));
    }
}
```





**Generic Interface**



```java

public class Car {

    String make,model,color;
    int price;

    public Car(String make,String model,String color,int price){
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getPrice(){
        return price;
    }

    public void printCar(){
        System.out.print(this);         //this prints the object created 
    }

    @Override
    public String toString(){
        return "Car [make=" + make +", model="+ model +", color=" + color + ", price=" + price + "]";
    }
}

```



```java
@FunctionalInterface
public interface Condition<T> {
    public boolean test(T t);
    
}
```

```java
    public static void main(String[] args) {

            List<Car> cars = Arrays.asList(
                new Car("Honda", "Accord", "Red", 22300),
                new Car("Toyota","Land Cruiser","White", 17700),
                new Car("Nissan","Sylpy","Blue", 18000)
            );


            System.out.println("\nprinting cars in 17900 - 25000 range...");
            printCars(cars, (c) -> c.getPrice() >= 17900 && c.getPrice() <= 25000);
/* 
For singlre line we don't need the return if it was multiple lines.  
The c is from test(c) -> c.getPrice() >= 17900 && c.getPrice() <= 25000.
Test(Car c) method is the only method in the functinal interface and it mapps to this lambda.
*/
      
            System.out.println("\nprinting Blue cars...");
            printCars(cars, (c) -> c.getColor().equals("Blue"));
            
        }// end of main


//-------------------------------------------------------------
// printcars(cars, condition) enhanced for loop
    public static void printCars(List<Car> cars, Condition<Car> condition){
        for(Car c: cars){
            if(condition.test(c)){
                c.printCar();
            }
        }
    }
```



**Using inbuilt JAVA generic predicate method**

It has a method test()

<img src="/Users/janithachathuranga/Library/Application Support/typora-user-images/image-20200705105103308.png" alt="image-20200705105103308"  />



![image-20200705104238403](/Users/janithachathuranga/Library/Application Support/typora-user-images/image-20200705104238403.png)

![image-20200705104545881](/Users/janithachathuranga/Library/Application Support/typora-user-images/image-20200705104545881.png)

























<img src="/Users/janithachathuranga/Library/Application Support/typora-user-images/image-20200705105402423.png" alt="image-20200705105402423" style="zoom:150%;" />

<img src="/Users/janithachathuranga/Library/Application Support/typora-user-images/image-20200705105446984.png" alt="image-20200705105446984" style="zoom:150%;" />

![image-20200705113324340](/Users/janithachathuranga/Library/Application Support/typora-user-images/image-20200705113324340.png)



![ ](/Users/janithachathuranga/Library/Application Support/typora-user-images/image-20200705113530619.png)  

![image-20200705113551220](/Users/janithachathuranga/Library/Application Support/typora-user-images/image-20200705113551220.png)







Udemy - The Complete Java Certification Course (Updated for 2018) Imitiaz Ahmad/18. Lambda Expressions and the Streams API/1. Functional Interfaces and Lambdas.mp4*



**Interface definition**

1. 1.

   a point where two systems, subjects, organizations, etc. meet and interact.

   "the **interface between** accountancy and the law"

2. 2.

   a device or program enabling a user to communicate with a computer.

   - a device or program for connecting two items of hardware or software so that they can be operated jointly or communicate with each other.