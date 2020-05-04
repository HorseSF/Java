class MySuperClass {
  public void message() {
    System.out.println("From the super class!");
  }
 }
class MySubClass extends MySuperClass {
  void message() {
    System.out.println("From the subclass!");
  }
  public static void main(String[] args) {
    MySubClass mysub = new MySubClass();
    mysub.message();
  }
}
