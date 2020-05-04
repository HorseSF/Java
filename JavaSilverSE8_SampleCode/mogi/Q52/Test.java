class Foo {
  int data = 1;
  void setData(int a) { data += a; }
  int getData() { return data; }
}
public class Test {
  public static void main(String[] args) {
    Foo obj = new Foo();
    obj.setData((int)(Math.random() * 100));
    [   ‡@   ]
    System.out.println(obj.getData());
  }
}
