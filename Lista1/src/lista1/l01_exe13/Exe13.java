package lista1.l01_exe13;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import jdk.internal.org.objectweb.asm.Opcodes;

public class Exe13 {
    
    private int codigo;
    private String produto;
    private double preco;

    public Exe13() {
    }

    public Exe13(int codigo, String produto, double preco) {
        this.codigo = codigo;
        this.produto = produto;
        this.preco = preco;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Exe13> produtos = new ArrayList<>();
        ArrayList<Exe13> produtosComprados = new ArrayList<>();
        produtos.add(new Exe13(100,"Bauru",2.00));
        produtos.add(new Exe13(101,"Cachorro Quente",5.00));
        produtos.add(new Exe13(102,"Refrigerante",4.00));
        produtos.add(new Exe13(103,"Cheeseburger",5.00));
        int np = 0;
        do {
            System.out.print("Digite o código do produto ou 0 para sair: ");
            np = Integer.parseInt(s.nextLine());
            int cont = 0;
            for (Exe13 p : produtos) {
                if (np == p.codigo) {
                    System.out.println("Esse código já existe, digite um código diferente");
                }else{
                    cont++;
                }
            }
            if (cont == produtos.size() && np != 0) {
                System.out.print("Digite o nome do produto: ");
                String nome = s.nextLine();
                System.out.print("Digite o preço do produto: ");
                double preco = Double.parseDouble(s.nextLine());
                produtos.add(new Exe13(np, nome, preco));
            }
        } while (np != 0);
        
        int cod = 0;
        double total = 0;
        do {            
            for (Exe13 p : produtos) {
                System.out.println(p.codigo+" - "+p.produto+" - "+p.preco);
            }
            System.out.print("Digite o código do produto para compra: ");
            cod = Integer.parseInt(s.nextLine());
            int cont = 0;
            for (Exe13 p : produtos) {
                if (p.codigo==cod) {
                    produtosComprados.add(p);
                    total = total + p.preco;
                }
                if (p.codigo != cod) {
                    cont +=1;
                }
            }
            if (cont == 4) {
                System.out.println("Digite um código de produto valido!");
            }
            
        } while (cod != 0);
        System.out.println("---Produtos comprados---");
        for (Exe13 pc : produtosComprados) {
            System.out.println(pc.produto);
        }
        DecimalFormat df = new DecimalFormat("0.00");//decimal format
        System.out.println("Total: R$ "+df.format(total));
    }
    
}
