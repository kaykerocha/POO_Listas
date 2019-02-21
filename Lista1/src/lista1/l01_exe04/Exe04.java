package lista1.l01_exe04;

import java.util.Scanner;

public class Exe04 {
    
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j;
        i = Integer.parseInt(scan.nextLine());
        j = Integer.parseInt(scan.nextLine());
        for (i = i; i <= j; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}
