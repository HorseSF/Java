class Employee {   //スーパークラスの定義
  private String id = "100";
  public String getId() {
    return id;
  }
}
class Sales extends Employee {   //サブクラスの定義
  private String clientName = "SE";
  public String getClientName() {
    return clientName;
  }
}
class Sample6_1 {  //サブクラスを利用しているクラス
  public static void main(String[] args) {
    Sales s = new Sales(); //サブクラスをインスタンス化
    // サブクラスで定義したメソッドの呼び出し
    System.out.println("clientName : " + s.getClientName());
    // スーパークラスで定義したメソッドの呼び出し
    System.out.println("id         : " + s.getId());
  }
}
