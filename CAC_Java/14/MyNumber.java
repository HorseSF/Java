class MyNumber implements DebugPrintable {
    int a;

    public MyNumber(int a) {
        this.a = a;
    }

    @Override
    public void debugPrint() {
        System.out.println("MyNumberのインスタンス：aの値は " + a + "です。");
    }

    public static void main(String[] args) {
        MyNumber num = new MyNumber(123);
        num.debugPrint();
    }
}
