package l01_exe10;

import java.util.Scanner;

public class Exe10 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0;
        String[] cores = {"Azul","Verde","Amarelo","Preto","Vermelho","Marrom"};
        do {            
            n = Integer.parseInt(s.nextLine());
            if (n >= 1 && n <=6) {
                System.out.println(cores[n-1]);
            }else{
                System.out.println("Fim do programa! Não existe nenhuma cor relacionada a esse código!");
            }
        } while (n >= 1 && n <=6);
    }
}
