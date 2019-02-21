package lista1.l01_exe05;

import java.text.DecimalFormat;
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
        DecimalFormat df = new DecimalFormat("0.000");//decimal format
        System.out.println("Média: "+df.format(md));
        
        String c ="";
        
        for (int i = 0; i < n-1; i++) {
            if (l[i] <= l[i+1]) {
                c = "cre";
            }else{
                c = "ale";
                break;
            }
        }       
        if (c.equals("ale")) {
            for (int i = 0; i < n-1; i++) {
                if (l[i] >= l[i+1]) {
                    c = "dec";
                }else{
                    c = "ale";
                    break;
                }
            }
        }
        
        System.out.println(c);
        if (c.equals("cre")) {
            System.out.println("Crescente");
        } else if (c.equals("dec")) {
            System.out.println("Decrescente");
        }else{
            System.out.println("Aleatório");
        }
        
    }
}
