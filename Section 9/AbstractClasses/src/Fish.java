public class Fish extends Animal{

    public Fish(String type, String size, double weiht) {
        super(type, size, weiht);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.println(getExplicitType() + " swimming ");
        } else {
            System.out.println(getExplicitType() + " darting ");
        }
    }

    @Override
    public void makeNoise() {
        if (type.equals("goldfish")) {
            System.out.print("swish! ");
        } else {
            System.out.print("splash! ");
        }
    }
}
