public class DrawGraph2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ":");
            for (int j = 0; j < i * i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
