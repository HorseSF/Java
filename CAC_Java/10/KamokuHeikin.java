public class KamokuHeikin {
    public static void main(String[] args) {
        Kamoku[] kamoku = {
                new Kamoku("国語", 63),
                new Kamoku("数学", 90),
                new Kamoku("英語", 75),
                new Kamoku("理科", 45),
                new Kamoku("社会", 81),
        };
        int sum = 0;
        for (int i = 0; i < kamoku.length; i++) {
            System.out.println(kamoku[i]);
            sum += kamoku[i].tensuu;
        }
        double heikin = (double) sum / kamoku.length;
        System.out.println("平均点数は" + heikin + "点。");
    }
}
