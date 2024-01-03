import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeHtml {
    public static void main(String[] args) {
        // ルール１
        String head = "<!DICTYPE html>"
                + "\n<html>"
                + "\n<head>"
                + "\n<title>My page</title>"
                + "\n</head>"
                + "\n<body>";
        System.out.println(head);

        // ルール３、ルール４、ルール５
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("◾️")) {
                    System.out.println("<h1>" + line.substring(1) + "</h1>");
                } else if (line.startsWith("●")) {
                    System.out.println("<h2>" + line.substring(1) + "</h2>");
                } else {
                    System.out.println("<p>" + line + "</p>");
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        // ルール２
        String foot = "</body>\n</html>";
        System.out.println(foot);
    }
}
