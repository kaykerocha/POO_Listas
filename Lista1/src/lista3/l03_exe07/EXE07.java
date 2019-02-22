package lista3.l03_exe07;

import java.util.Scanner;

public class EXE07 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String bin = s.nextLine();
        char[] bins = new char[bin.length()];
        bins = bin.toCharArray();
        int c = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bins[i]=='0' || bins[i]=='1') {
                c++;
            }
        }
        int decimal = 0;
        if (c == bin.length()) {
            decimal = Integer.parseInt(bin, 2);
        }
        System.out.println("BINARIO " + bin );
        System.out.println("DECIMAL "+ decimal);
    }
}
