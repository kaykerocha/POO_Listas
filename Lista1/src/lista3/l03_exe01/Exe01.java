package lista3.l03_exe01;

import java.util.Scanner;

public class Exe01 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a = Integer.parseInt(s.next());
        int b = Integer.parseInt(s.next());
        int c = Integer.parseInt(s.next());
        
        for (int i = b; i <= c; i++) {
            System.out.println(a+"*"+i+"="+a*i);
        }
    }
    
}
