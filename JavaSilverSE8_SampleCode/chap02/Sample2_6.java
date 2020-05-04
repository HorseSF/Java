import java.util.ArrayList;

class Sample2_6 {
  public static void main(String[] args) {
    /*String[] array;             //配列を使用した場合
    array = new String[1];
    array[0] = "田中";
    String name = array[0];
    System.out.println(name + " : " + array.length); */
 
    ArrayList<String> array;    //ArrayListクラスを使用した場合
    array = new ArrayList<String>(3);
    array.add("田中");
    String name = array.get(0);
    System.out.println(name + " : " + array.size());
  }
}
