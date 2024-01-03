import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Convert1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                String s = line.replace('。', '.');
                s = s.replace('、', ',');
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
