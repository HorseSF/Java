class SuperClass {
  SuperClass() { }
  SuperClass(int i) { 
    System.out.println("The value of i is " + i);
  }
}
class SubClass extends SuperClass {
  SubClass(int j) {
  [     ‡@     ]
  [     ‡A     ]
  }
}
public class Test {
  public static void main(String[] args) {
    SubClass sub = new SubClass(5);
  }
}
