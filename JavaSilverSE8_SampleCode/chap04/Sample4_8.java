import java.util.ArrayList;

class Sample4_8 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("a");  list.add("b");  list.add("c");
    //for��
    for (int count = 0; count < list.size() ; count++) {
      System.out.print(list.get(count) + " ");
    }
    System.out.println();
    //�g��for��
    for (String str : list) {  // �g��for���ŏ�������ꍇ
      System.out.print(str + " ");
    }

  }
}
