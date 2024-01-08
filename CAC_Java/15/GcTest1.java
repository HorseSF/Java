public class GcTest1 {
    public static void main(String[] args) {
        while (true) {
            String s = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            System.out.println("残りメモリ = " + Runtime.getRuntime().freeMemory());
        }
    }
}
