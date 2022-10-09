package academy.learnprogramming;

public class Wardrobe {

    private String type;
    private int width;
    private int length;
    private int height;

    public Wardrobe(String type, int width, int length, int height) {
        this.type = type;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void getDressed() {
        System.out.println("Bed => Wear cloths");
    }

    public String getType() {
        return type;
    }
    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
