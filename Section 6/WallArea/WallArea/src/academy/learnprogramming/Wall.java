package academy.learnprogramming;

public class Wall {
    private double width;
    private double height;

    public Wall () {
    }

    public Wall (double width, double height) {
        this.setWidth(width);
        this.setHeight(height);

    }
    public double getArea () {
        return this.width * this.height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
            return;
        }
        this.height = height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
            return;
        }
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
