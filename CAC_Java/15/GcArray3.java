public class GcArray3 {
    public static void main(String[] args) {
        for (int n = 0; true; n++) {
            int[] a = new int[1000];
            for (int i = 0; i < a.length; i++) {
                a[i] = i;
            }
            if (n % 100 == 0) {
                System.out.println("gcを呼び出します。");
                System.gc();
            }
            System.out.println("残りメモリ = " + Runtime.getRuntime().freeMemory());
        }
    }
}
