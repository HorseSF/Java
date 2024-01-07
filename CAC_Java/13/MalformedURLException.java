// TODO: incompatible types: MalformedURLException cannot be converted to java.lang.Throwable(compiler.err.prob.found.req)

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class MalformedURLException {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("URL= " + arg);
            try {
                URL url = new URL(arg);
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                while (true) {
                    String line = reader.readLine();
                    if (line == null) {
                        break;
                    }
                    System.out.println(line);
                }
                reader.close();
            } catch (MalformedURLException e) {
                System.out.println(e);
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
