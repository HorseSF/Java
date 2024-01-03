import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drink3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "飲み物は何が好きですか。" +
                "\n1 オレンジジュース(a)" +
                "\n2 コーヒー(b)" +
                "\n3 どちらでもない(c)" +
                "\n1,2,3のどれかを選んでください。";
        System.out.print(str);
        try {
            String line = reader.readLine();
            char c = line.charAt(0);
            switch (c) {
                case '1':
                case 'a':
                    System.out.println("オレンジジュースです。");
                    break;
                case '2':
                case 'b':
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
