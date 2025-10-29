package exercise3;


public class Main {
    public static void main(String[] args) {

        //TODO: Create Car Object
        //   System.out.println(car.toString);
        Car car = new Car("ZH420", 60, 62000, 0.077, 60);
        Car car01 = new Car("ZH67", 20, 505, 0.050, 100);

        System.out.println(" ");

        System.out.println("Statistics before drive and refuel " + car);
        System.out.println( "| Distance to drive 50 and Refuel 10 | ");
        car.drive(50);
        car.refuel(10);
        System.out.println("Statistics after drive and refuel" + car);
        System.out.println(" ");

        System.out.println("Statistics before drive and refuel" + car01);
        System.out.println( "| Distance to drive 100 and Refuel 70 | ");
        car01.drive(100);
        car01.refuel(70);
        System.out.println("Statistics after drive and refuel" + car01);


    }
}
