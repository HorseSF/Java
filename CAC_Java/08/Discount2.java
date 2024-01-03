public class Discount2 {
    public static void main(String[] args) {
        int p, q;
        p = 10000;
        q = halve(p);
        System.out.println("元の値段が" + p + "円なら、半額だと" + q + "円にないrます。");
    }

    public static int halve(int n) {
        return n / 2;
    }
}
