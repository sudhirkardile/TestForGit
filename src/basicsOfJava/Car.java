package basicsOfJava;

public class Car {
    String model;
    int price;
    int wheels;

    public static void main(String[] args) {
        Car a = new Car();
        Car b = new Car();
        Car c = new Car();

        a.model = "BMW";
        a.price = 20000;
        a.wheels = 4;

        System.out.println("Model of car is: "+a.model);
        System.out.println("Price of car is: "+a.price);
        System.out.println("Wheels of car are: "+a.wheels);
    }
}
