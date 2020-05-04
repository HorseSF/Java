import java.util.*;
import java.util.function.*;

class Foo{
  int id;
  String name;
  Foo(int id, String name) {
    this.id = id;
    this.name = name;
  }
  int getId() { return this.id; }
  String getName() { return this.name; }
}
public class Test {
  public static void main(String[] args) {
    List<Foo> list = new ArrayList<>();
    list.add(new Foo(10, "tanaka"));
    list.add(new Foo(20, "yamada"));
    list.add(new Foo(30, "suzuki"));
    method(list, [   ‡@   ]);
  }
  static void method(List<Foo> list, Predicate<Foo> op) {
    for(Foo obj : list) {
      if(op.test(obj)) {
        System.out.println(obj.getId());
        System.out.println(obj.getName());
      }
    }
  }
}