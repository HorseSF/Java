import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Alice");
        list.add("Bob");
        list.add("Chris");
        list.add("Diana");
        list.add("Elmo");

        for (Iterator<String> it = list.iterator(); it.hasNext();) {
            String name = it.next();
            System.out.println(name);
        }
    }
}
