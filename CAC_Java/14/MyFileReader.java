import java.io.*;

class MyFileReader extends FileReader implements DebugPrintable {
    String filename = null;

    public MyFileReader(String filename) throws FileNotFoundException {
        super(filename);
        this.filename = filename;
    }

    @Override
    public void debugPrint() {
        System.out.println("MyFileReaderのインスタンス：ファイル名は" + filename + "です。");
    }

    public static void main(String[] args) {
        try {
            MyFileReader reader = new MyFileReader("input.txt");
            reader.debugPrint();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
