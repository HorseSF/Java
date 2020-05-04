import java.util.*;
class Sample7_9 {
  public static void main(String[] args) {
    int[] i_array = {30, 10, 20, 50, 40};

    //arraycopy()���\�b�h�̗��p
    int[] copy = new int[3];
    System.arraycopy(i_array, 2, copy, 0, 3);
    for(int val: copy) {
      System.out.print(val + " ");
    }System.out.println();
    
    //sort()���\�b�h�̗��p
    Arrays.sort(i_array);
    for(int val: i_array) {
      System.out.print(val + " ");
    }System.out.println();
    
    //asList()���\�b�h�̗��p
    String[] s_array = {"tanaka", "suzuki", "yamada"};
    List<String> list = Arrays.asList(s_array);
    //list.add("sato");
    for(String val: list) {
      System.out.print(val + " ");
    }
  }
}
