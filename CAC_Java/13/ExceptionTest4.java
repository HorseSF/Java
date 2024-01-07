public class ExceptionTest4 {
    public static void main(String[] args) {
        int[] myarray = new int[3];
        try {
            System.out.println("代入します");
            myAssign(myarray, 100, 0);
            System.out.println("代入しました");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("終了します");
    }

    static void myAssign(int[] arr, int index, int value) {
        System.out.println("myAssignに来ました");
        arr[index] = value;
        System.out.println("myAssignから帰ります");
    }
}
