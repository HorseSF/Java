public class GoodBank {
    private int value = 0;

    public synchronized void addMoney(int money) {
        int currentValue = value;
        System.out.println(Thread.currentThread() + "が addMoney に入りました。");
        value += money;
        if (currentValue + money != value) {
            System.out.println(Thread.currentThread() + "で矛盾が発生しました！");
            System.exit(-1);
        }
        System.out.println(Thread.currentThread() + "が addMoney から出ました。");
    }
}
