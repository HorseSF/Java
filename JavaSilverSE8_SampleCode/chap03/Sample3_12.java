class Sample3_12 {
  public static void main(String[] args) {
    String s1 = "X";
    String s2 = s1 + "Y";
    System.out.println("s1 == s2   : " + ( s1 == s2 ));

    String s3 = "X";
    String s4 = s3.concat("Y");
    System.out.println("s3 == s4   : " + ( s3 == s4 ));

    StringBuilder s5 = new StringBuilder ("X");
    StringBuilder s6 = s5.append("Y");
    System.out.println("s5 == s6   : " + ( s5 == s6 ));
  }
}
