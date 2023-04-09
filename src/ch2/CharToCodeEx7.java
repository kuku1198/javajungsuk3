package ch2;

/**
 * ex 2-7
 */
public class CharToCodeEx7 {
    public static void main(String[] arge) {
        char ch = 'A';
        int code = (int)ch;

        System.out.printf("%c=%d(%#X) %n", ch, code, code);

        char hch = '가';
        System.out.printf("%c=%d(%#X) %n", hch, (int)hch, (int)hch);
    }
}
