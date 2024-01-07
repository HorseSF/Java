public class ExceptionTest2 {
    public static void main(String[] args) {
        int[] myarray = new int[3];
        try {
            System.out.println("代入します");
            myarray[100] = 0;
            System.out.println("代入しました");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("終了します");
    }
}
