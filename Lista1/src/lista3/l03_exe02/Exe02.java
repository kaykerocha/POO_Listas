package lista3.l03_exe02;

import java.util.Scanner;

public class Exe02 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int[] num = new int[10];
        
        for (int i = 0; i < num.length; i++) {
            num[i]=Integer.parseInt(s.next());
        }
        
        for (int i = num.length-1; i >= 0; i--) {
            System.out.print(num[i]+" ");
        }
    }
    
}
