package l01_exe13;

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
        int cod = 0;
        double total = 0;
        do {            
            System.out.print("Digite o código do produto: ");
            cod = Integer.parseInt(s.nextLine());
            int cont = 0;
            for (Exe13 p : produtos) {
//                if (p.codigo==cod) {
//                    produtosComprados.add(p);
//                    total = total + p.preco;
//                }
//                if (p.codigo != cod) {
//                    cont +=1;
//                }
                produtosComprados.add((p.codigo == cod) ? p : p);
            }
            
            
        } while (cod != 0);
        System.out.println("---Produtos comprados---");
        for (Exe13 pc : produtosComprados) {
            System.out.println(pc.produto);
        }
        System.out.println("Total: R$ "+total);
    }
    
}
