class Sample7_3 {
  public static void main(String[] args) {
    String s1 = "tanaka";  
    String s2 = new String("tanaka");
    String s3 = "Tanaka";
    System.out.println("s1 == s2      : " + (s1 == s2));
    System.out.println("s1.equals(s2) : " + (s1.equals(s2)));
    System.out.println("s1.equals(s3) : " + (s1.equals(s3)));
    System.out.println("s1.equalsIgnoreCase(s3) : " + 
                                  (s1.equalsIgnoreCase(s3)));
  }
}
