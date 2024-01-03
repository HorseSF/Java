import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kasa3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("降水確率を入力してくだいさい。");
            String line = reader.readLine();
            int n = Integer.parseInt(line);
            System.out.println("降水確率は" + n + "%です。");
            if (n < 0 || n > 100) {
                System.out.println("降水確率は０〜１００の間ですよ。");
            } else if (n >= 50) {
                System.out.println("傘を忘れずにね。");
            } else {
                System.out.println("傘はいりません。");
            }
            System.out.println("いってらっしゃい。");
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
    }
}
