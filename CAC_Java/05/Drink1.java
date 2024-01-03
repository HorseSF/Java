import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drink1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "飲み物は何が好きですか。" +
                "\n1 オレンジジュース" +
                "\n2 コーヒー" +
                "\n3 どちらでもない" +
                "\n1,2,3のどれかを選んでください。";
        System.out.print(str);
        try {
            String line = reader.readLine();
            int n = Integer.parseInt(line);
            switch (n) {
                case 1:
                    System.out.println("オレンジジュースです。");
                    break;
                case 2:
                    System.out.println("コーヒーです。");
                    break;
                default:
                    System.out.println("どちらでもありません。");
                    break;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字形式ではありません。");
        }
    }
}
