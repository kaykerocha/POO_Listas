package lista2.l02_exe11;

import java.util.Arrays;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeString;

public class Teste {
    
    public static boolean verificaCPF(String cpf){
        char[] c = cpf.toCharArray();
        if (cpf.length() == 14) {
            if (c[3] == '.' && c[7] == '.' && c[11] == '-' ) {
                cpf.replace(".", "");
                cpf.replace("-", "");
                int cont = 0;
                for (int i = 0; i < c.length; i++) {
                    if (Character.isDigit(c[i])) {
                        cont++;
                    }
                }
                if (cont == 11) {
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("");
        Scanner s = new Scanner(System.in);
        if (verificaCPF(s.nextLine())) {
            System.out.println("CPF válido!");
        }else{
            System.out.println("CPF inválido!");
        }
        
    }
    
}
