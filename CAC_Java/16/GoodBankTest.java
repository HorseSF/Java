public class GoodBankTest extends Thread {
    GoodBank bank;

    public GoodBankTest(GoodBank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (true) {
            bank.addMoney(100);
            bank.addMoney(-100);
        }
    }

    public static void main(String[] args) {
        GoodBank bank = new GoodBank();
        new GoodBankTest(bank).start();
        new GoodBankTest(bank).start();
    }
}
