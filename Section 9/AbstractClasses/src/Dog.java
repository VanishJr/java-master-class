public class Dog extends Animal{

    public Dog(String type, String size, double weiht) {
        super(type, size, weiht);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.print(getExplicitType() + " walking ");
        } else {
            System.out.print(getExplicitType() + " running ");
        }
    }

    @Override
    public void makeNoise() {
        if (type.equals("wolf")) {
            System.out.println("Howling!");
        } else {
            System.out.println("Woof!");
        }
    }
}
