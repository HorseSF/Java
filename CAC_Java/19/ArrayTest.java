public class ArrayTest {
    public static void main(String[] args) {
        String[] array = new String[3];

        array[0] = "Alice";
        array[1] = "Bob";
        array[2] = "Chris";

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}