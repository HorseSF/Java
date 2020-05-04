public class Test {
  public static void main(String[] args) {
    Object o1 = new Object();
    Object o2 = new Object();
    Object o3 = o1;
    if (o1 == o2)     System.out.print("o1==o2  ");
    if (o1.equals(o2)) System.out.print("o1.equals(o2)  ");
    if (o3 == o1)     System.out.print("o3==o1  ");
    if (o3.equals(o1)) System.out.print("o3.equals(o1)  ");
  }
}
