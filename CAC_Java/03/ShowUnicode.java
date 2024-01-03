import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShowUnicode {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("文字列を入力してください。");
            String line = reader.readLine();
            for (int i = 0; i < line.length(); i++){
                char unicode = line.charAt(i);
                System.out.println("'" + unicode + "'の文字コードは" + (int)unicode + "です。");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
