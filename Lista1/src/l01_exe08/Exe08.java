package l01_exe08;

import java.util.Scanner;

public class Exe08 {
    
    public static boolean primo(int num){
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if (num%i == 0) {
                cont +=1;
            }
        }
        return cont == 2;
    }
    
    public static void intervaloPrimo(int i, int j){
        for (i = i; i <= j; i++) {
            if (primo(i)) {
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        if (primo(Integer.parseInt(s.nextLine()))) {
            System.out.println("Número primo!");
        }else{
            System.out.println("Não é primo!");
        }
        
        intervaloPrimo(Integer.parseInt(s.nextLine()), Integer.parseInt(s.nextLine()));
    }
    
}
