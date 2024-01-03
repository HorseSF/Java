import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drink2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "飲み物は何が好きですか。" +
                "\na オレンジジュース" +
                "\nb コーヒー" +
                "\nc どちらでもない" +
                "\na,b,cのどれかを選んでください。";
        System.out.print(str);
        try {
            String line = reader.readLine();
            char c = line.charAt(0);
            switch (c) {
                case 'a':
                    System.out.println("オレンジジュースです。");
                    break;
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
