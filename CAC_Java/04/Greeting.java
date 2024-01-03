import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greeting {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("現在の時刻(「時」だけでよい)を入力してください。");
            String line = reader.readLine();
            int n = Integer.parseInt(line);
            if (n >= 0 && n <= 11) {
                System.out.println("おはようございます。");
            } else if (n == 12) {
                System.out.println("お昼です。");
            } else if (n >= 13 && n <= 18) {
                System.out.println("こんにちは");
            } else if (n >= 13 && n <= 23) {
                System.out.println("こんばんは");
            } else {
                System.out.println("時刻の範囲を越えています。");
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字形式ではありません。");
        }
    }
}
