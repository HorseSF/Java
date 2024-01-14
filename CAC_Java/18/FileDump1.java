import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDump1 {
    public static void main(String[] args) {
        DataInputStream in = null;
        if (args.length != 1) {
            System.out.println("使用法：java FileDump1 ファイル名");
            System.exit(0);
        }
        try {
            in = new DataInputStream(new BufferedInputStream(new FileInputStream(args[0])));
            int offest = 0;
            while (true) {
                byte b = in.readByte();
                if (offest % 16 == 0) {
                    System.out.print(intToHexString(offest) + ": ");
                } else if (offest % 8 == 0) {
                    System.out.print("-");
                } else {
                    System.out.print(" ");
                }
                System.out.print(byteToHexString(b));
                if (offest % 16 == 15) {
                    System.out.println("");
                }
                offest++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(args[0] + "が見つかりません。");
        } catch (EOFException e) {
            System.out.println("");
        } catch (IOException e) {
            System.out.println("" + e);
        }
        try {
            if (in != null) {
                in.close();
            }
        } catch (IOException e) {
            System.out.println("" + e);
        }
    }

    public static String intToHexString(int n) {
        return byteToHexString((byte) (n >>> 24))
                + byteToHexString((byte) (n >>> 16))
                + byteToHexString((byte) (n >>> 8))
                + byteToHexString((byte) n);
    }

    public static String byteToHexString(byte b) {
        int n = (int) b;
        if (n < 0) {
            n = 256 + n;
        }
        if (n < 16) {
            return "0" + Integer.toHexString(n).toUpperCase();
        } else {
            return Integer.toHexString(n).toUpperCase();
        }
    }
}
