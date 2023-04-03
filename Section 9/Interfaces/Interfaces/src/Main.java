public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        Trackable tracked = bird;
        FlightEnabled flier = bird;

        animal.move();
        flier.takeoff();
        flier.fly();
        flier.land();
        tracked.track();
    }
}