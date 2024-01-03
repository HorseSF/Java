public class test {
    public static void main(String[] args) {
        String str = "abc";
        int address = System.identityHashCode(str);
        System.out.println(str + ": " + address);

        str = "def";
        address = System.identityHashCode(str);
        System.out.println(str + ": " + address);
    }
}
