package academy.learnprogramming;

public class Table {

    private String type;
    private int width;
    private int length;
    private int height;

    public Table(String type, int width, int length, int height) {
        this.type = type;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void work() {
        System.out.println("Cloths => Work");
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
