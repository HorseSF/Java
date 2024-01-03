import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drink4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "飲み物は何が好きですか。" +
                "\nオレンジジュース(orange)" +
                "\nコーヒー(coffee)" +
                "\nどちらでもない(other)" +
                "\nどれかを選んでください。";
        System.out.print(str);
        try {
            String line = reader.readLine();
            switch (line) {
                case "orange":
                    System.out.println("オレンジジュースです。");
                    break;
                case "coffee":
                    System.out.println("コーヒーです。");
                    break;
                default:
                    System.out.println("どちらでもありません。");
                    break;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
