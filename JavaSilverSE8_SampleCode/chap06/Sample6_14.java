abstract class Foo {
  int x; int y;
  public abstract void print();
  public void method(int x, int y){ this.x = x; this.y = y; }
}
class MyClass extends Foo {
  public void print() {
    System.out.println("x : " + x + " y : " + y);
  }
}
class Sample6_14 {
  public static void main(String[] args) {
    //�X�[�p�[�N���X�̕ϐ��ɃT�u�N���X�̃I�u�W�F�N�g����
    Foo f = new MyClass(); 
    f.method(10, 20);  // �X�[�p�[�N���X�̃��\�b�h�Ăяo��OK
    f.print();         // �T�u�N���X�̃��\�b�h�Ăяo��OK
  }
}
