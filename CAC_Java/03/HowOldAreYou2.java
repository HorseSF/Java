import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowOldAreYou2 {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            // 一人目
            System.out.println("あなたの名前を入力してください。");
            String line = reader.readLine();
            System.out.println(line + "さん、こんにちは。");
            System.out.println("年齢を入力してください。");
            line = reader.readLine();
            int age1 = Integer.parseInt(line);
            // 二人目
            System.out.println("あなたの名前を入力してください。");
            line = reader.readLine();
            System.out.println(line + "さん、こんにちは。");
            System.out.println("年齢を入力してください。");
            line = reader.readLine();
            int age2 = Integer.parseInt(line);
            double age = (age1 + age2) / 2.0;
            System.out.println("平均年齢：" + age);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("年齢が正しくありません。");
        }
    }
}
