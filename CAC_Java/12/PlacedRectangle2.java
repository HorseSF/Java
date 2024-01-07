class PlacedRectangle2 {
    Rectangle r;
    int x;
    int y;

    PlacedRectangle2() {
        r = new Rectangle();
        setLocation(0, 0);
    }

    PlacedRectangle2(int x, int y) {
        r = new Rectangle();
        setLocation(x, y);
    }

    PlacedRectangle2(int x, int y, int width, int height) {
        r = new Rectangle(width, height);
        setLocation(x, y);
    }

    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[ ( " + x + ", " + y + ") " + r + "]";
    }

    public static void main(String[] args) {
        PlacedRectangle2 a = new PlacedRectangle2();
        PlacedRectangle2 b = new PlacedRectangle2(12, 34);
        PlacedRectangle2 c = new PlacedRectangle2(31, 41, 59, 26);
        PlacedRectangle2 d = new PlacedRectangle2(1, 2, 100, 200);
        d.setLocation(3, 4);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
