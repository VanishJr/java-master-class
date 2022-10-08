package academy.learnprogramming;

public class Main {
            public static void main(String[] args) {
                // Inheritance Challenge
                SportCar sportCar = new SportCar(0,0,1,36);
                sportCar.steer(45);
                sportCar.accelerate(30);
                sportCar.accelerate(20);
                sportCar.accelerate(-42);
             }
}