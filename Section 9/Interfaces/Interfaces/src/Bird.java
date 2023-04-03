public class Bird extends Animal implements Trackable, FlightEnabled {
    @Override
    public void move() {
        System.out.println("Flaps wings");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s  coordinates recorded");
    }

    @Override
    public void takeoff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }
}
