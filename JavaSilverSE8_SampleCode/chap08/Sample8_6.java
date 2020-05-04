class MyException extends Exception { //独自例外クラス
  private int age;
  public void setAge(int age) { this.age = age; }
  public int getAge() { return this.age; }
}

class Sample8_6 {
  public static void main(String[] args){
    try {
      int age = -10;
      checkAge(age);
    } catch (MyException e) {
      System.out.println("不正な値です。age : " + e.getAge());
    }
  }
  public static void checkAge(int age) throws MyException{
    if (age >= 0) {
      System.out.println("OK");
    } else {
      MyException e = new MyException();
      e.setAge(age);
      throw e;
    }
  }
}
