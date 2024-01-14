import java.util.ArrayList;
import java.util.List;

public class ArrayListTestX {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Alice");
        list.add("Bob");
        list.add("Chris");
        list.add("Bob");
        list.add("Elmo");

        System.out.println("最初の要素 = " + list.get(0));
        System.out.println("最後の要素 = " + list.get(list.size() - 1));

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("最初に出てくるBobの添字 = " + list.indexOf("Bob"));
        System.out.println("最終に出てくるBobの添字 = " + list.lastIndexOf("Bob"));
    }
}
