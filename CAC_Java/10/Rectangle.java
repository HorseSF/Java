public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[ " + width + "," + height + " ]";
    }
}