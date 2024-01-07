public class NumberTest {
    public static void main(String[] args) {
        try {
            String numstr = "XYZ";
            int val = Integer.parseInt(numstr);
            System.out.println(val);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
