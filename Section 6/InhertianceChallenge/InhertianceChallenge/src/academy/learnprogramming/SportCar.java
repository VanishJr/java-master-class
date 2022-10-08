package academy.learnprogramming;

public class SportCar extends Car{
    private int roadServiceMonths;

    public SportCar(int steering, int speed, int currentGear, int roadServiceMonths) {
        super("Sport Car", "Rear", 5, 5, steering, 6, speed, currentGear);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGears(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGears(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGears(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGears(3);
        } else {
            changeGears(4);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}