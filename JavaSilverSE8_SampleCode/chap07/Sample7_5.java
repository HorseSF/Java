class Sample7_5 {
  public static void main(String[] args) {
    Integer val1 = 1;
    Integer val2 = 1;
    System.out.println("val1 == val2      : " + (val1 == val2));
    
    Integer val3 = 150;
    Integer val4 = 150;
    System.out.println("val3 == val4      : " + (val3 == val4));
    System.out.println("val3.equals(val4) : " + (val3.equals(val4)));
    
    Integer val5 = new Integer(1);
    System.out.println("val1 == val5      : " + (val1 == val5));
    System.out.println("val1.equals(val5) : " + (val1.equals(val5)));
    
    Long val6 = new Long(150);
    Double val7 = new Double(150.0);
    System.out.println("val3.equals(val6) : " + (val3.equals(val6)));
    System.out.println("val3.equals(val7) : " + (val3.equals(val7)));
    
    System.out.println("val3.equals(val6.intValue())  : " + 
                      ( val3.equals(val6.intValue())));
    System.out.println("val3.equals(val7.intValue())  : " + 
                      ( val3.equals(val7.intValue())));
  }
}
