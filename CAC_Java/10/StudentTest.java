public class StudentTest {
    public static void main(String[] args) {
        Student[] data = {
                new Student("aaa", 65, 90, 100),
                new Student("bbb", 82, 73, 64),
                new Student("ccc", 74, 31, 42),
                new Student("ddd", 100, 95, 99),
        };
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + "\t-> " + data[i].total());
        }
    }
}
