package academy.learnprogramming;

public class Bed {

    private String type;
    private int width;
    private int length;
    private int height;

    public Bed(String type, int width, int length, int height) {
        this.type = type;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void sleep() {
        System.out.println("Work => Sleep");
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

    public String getType() {
        return type;
    }
}
