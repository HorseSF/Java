public class Kamoku {
    String namae;
    int tensuu;

    public Kamoku(String namae, int tensuu) {
        this.namae = namae;
        this.tensuu = tensuu;
    }

    @Override
    public String toString() {
        return namae + "は" + tensuu + "点";
    }
}