package lista2.l02_exe12;

import java.util.ArrayList;

public class Contato {
    private String nome;
    private ArrayList<Telefone> numeros = new ArrayList<>();
    private String email;

    public Contato() {
    }

    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    
    public void addTelefone(Telefone telefone){
        numeros.add(telefone);
    }
    
    public String toString(){
        String s = "";
        s = s + "---" + this.nome + "---\n";
        for (Telefone numero : numeros) {
            s+= numero +"\n";
        }
        s+=this.email;
        return s;
    }
    
}
