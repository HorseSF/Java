public class ExceptionTest1 {
    public static void main(String[] args) {
        int[] myarray = new int[3];
        System.out.println("代入します");
        myarray[100] = 0;
        System.out.println("代入しました");
        System.out.println("終了します");
    }
}
