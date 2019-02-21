package lista2.l02_exe07;

import java.util.ArrayList;

public class Departamento {
    private String nome;
    private String descricao;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Departamento() {
    }

    public Departamento(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public void addProduto(Produto p){
        produtos.add(p);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
    
}
