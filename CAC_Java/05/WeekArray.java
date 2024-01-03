import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeekArray {
    public static void main(String[] args) {
        String[] week = { "日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日" };
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("0~6を入力してください。");
            String line = reader.readLine();
            int n = Integer.parseInt(line);
            if (n >= 0 && n <= 6) {
                System.out.println(week[n]);
            } else {
                System.out.println("0~6範囲を入力してください。");
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字を入力してください。");
        }

    }
}
