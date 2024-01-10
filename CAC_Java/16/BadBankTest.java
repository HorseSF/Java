public class BadBankTest extends Thread {
    BadBank bank;

    public BadBankTest(BadBank bank) {
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
        BadBank bank = new BadBank();
        new BadBankTest(bank).start();
        new BadBankTest(bank).start();
    }
}
