class Boo {
  private String msg;
  public Boo(String m) { msg = m; }
  public void setMsg(String m) { msg = m; }
  public String getMsg() { return msg; }
  public Goo useGoo(Goo g) {
    setMsg(g.getMsg());
    return g;
  }
}

class Goo {
  private String msg;
  public Goo(String m) { msg = m; }
  public void setMsg(String m) { msg = m; }
  public String getMsg() { return msg; }
}

public class Test {
  public static void main(String[] args) {
    Boo b = new Boo("Boo");
    Goo g = new Goo("Goo");
    b.useGoo(g);
    System.out.println(b.getMsg() + " : " + g.getMsg());
  }
}
