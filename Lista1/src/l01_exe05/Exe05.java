package l01_exe05;

import java.util.Scanner;

public class Exe05 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        int l[] = new int[n];
        for (int i = 0; i < n; i++) {
            l[i]=Integer.parseInt(s.nextLine());
        }
        int me = l[0], ma = l[0];
        float md = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] < me) {
                me = l[i];
            }
            if (l[i] > ma) {
                ma = l[i];
            }
            md = l[i] + md;
        }
        md = md/n;
        System.out.println("Menor: "+me);
        System.out.println("Maior: "+ma);
        System.out.println("Média: "+md);
    }
}
