package lista2.l02_exe12;

public class Chamada {
    private Telefone telefone;
    private int duracao;

    public Chamada() {
    }

    public Chamada(Telefone telefone, int duracao) {
        this.telefone = telefone;
        this.duracao = duracao;
    }
    
    public String toString(){
        String s = "";
        s = s + this.telefone + "\n" + this.duracao + " Minutos";
        return s;
    }
    
}
