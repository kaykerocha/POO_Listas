package l01_exe07;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe07 {
    
    private String nome;
    private float preco;
    private int qtd;
    private int desconto;

    public Exe07() {
    }

    public Exe07(String nome, float preco, int qtd, int desconto) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
        this.desconto = desconto;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Exe07> pro = new ArrayList<>();
        int n = Integer.parseInt(s.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            String nome = s.nextLine();
            System.out.print("Preço: ");
            float preco = Float.parseFloat(s.nextLine());
            System.out.print("Quantidade: ");
            int qtd = Integer.parseInt(s.nextLine());
            System.out.print("Desconto %: ");
            int desconto = Integer.parseInt(s.nextLine());
            Exe07 e = new Exe07(nome, preco, qtd, desconto);
            pro.add(e);
        }
    } 
}
