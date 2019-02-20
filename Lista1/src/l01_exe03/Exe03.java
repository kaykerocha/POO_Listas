package l01_exe03;

import java.util.Scanner;

public class Exe03 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nome;
        Integer idade;
        Double salario;
        String sexo;
        String estadoCivil;
        
        do {
            System.out.print("Digite um nome: ");
            nome = scan.nextLine();
            if (nome.length() <= 3) {
                System.out.println("Digite um nome com mais de 3 caracteres");
            }
        } while (nome.length() <= 3);
        
        do {
            System.out.print("Digite uma idade: ");
            idade = Integer.parseInt(scan.nextLine());
            if (idade < 0 || idade > 200) {
                System.out.println("Digite uma idade entre 0 e 200");
            }
        } while (idade < 0 || idade > 200);
        
        do {
            System.out.print("Digite um salário: ");
            salario = Double.parseDouble(scan.nextLine());
            if (salario <= 0) {
                System.out.println("Digite um salário maior que 0");
            }
        } while (salario <= 0);
        
        do {
            System.out.print("Digite o sexo: ");
            sexo = scan.nextLine();
            System.out.println(sexo);
            if (!sexo.equals("masculino") && !sexo.equals("feminino")) {
                System.out.println("Digite o sexo masculino ou feminino");
            }
        } while (!sexo.equals("feminino") && !sexo.equals("masculino"));
        
        do {
            System.out.print("Digite o estado civil: ");
            estadoCivil = scan.nextLine();
            if (!estadoCivil.equals("solteiro") && !estadoCivil.equals("casado") && !estadoCivil.equals("viuvo") && !estadoCivil.equals("divorciado")) {
                System.out.println("Digite o estado civil solteiro, casado, viuvo ou divorciado");
            }
        } while (!estadoCivil.equals("solteiro") && !estadoCivil.equals("casado") && !estadoCivil.equals("viuvo") && !estadoCivil.equals("divorciado"));
        
        
    }
}
