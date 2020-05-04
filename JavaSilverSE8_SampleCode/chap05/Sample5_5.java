class Employee {
  int id;  	String name;
  Employee() { System.out.println("Employee()");}
  Employee(String name) { System.out.println("Employee(String name)");}
  Employee(int id) { System.out.println("Employee(int id)");}
  Employee(int id, String name) { 
    System.out.println("Employee(int id, String name)");}
}
class Sample5_5 {
  public static void main(String[] args) {
    Employee a = new Employee();
    Employee b = new Employee("yamamoto");
    Employee c = new Employee(100);
    Employee d = new Employee(100, "yamamoto");
  }
}
