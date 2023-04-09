package ch2;

public class OverflowEx9 {
    public static void main(String[] args) {
        short sMin = -32768;
        short sMax = 32767;
        char cMin = 0;
        char xMax = 65335;

        System.out.println("sMin =" + sMin);
        System.out.println("sMin-1 =" + (short)(sMin-1));
        System.out.println(50 + -4);
    }
}
