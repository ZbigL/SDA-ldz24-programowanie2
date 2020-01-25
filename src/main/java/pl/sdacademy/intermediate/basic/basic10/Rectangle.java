package pl.sdacademy.intermediate.basic.basic10;

public class Rectangle {

    int width;
    int height;


    public Rectangle(int width, int height) {
        if (width > 0 && height > 0) {
            this.width = width;
            this.height = height;
        } else throw new IllegalArgumentException("Width and height must be > 0!");
    }

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return 2 * width + 2 * height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
