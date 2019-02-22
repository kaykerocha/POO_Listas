package lista2.l02_exe12;

public class Mensagem {
    private Telefone telefone;
    private String mensagem;

    public Mensagem() {
    }

    public Mensagem(Telefone telefone, String mensagem) {
        this.telefone = telefone;
        this.mensagem = mensagem;
    }
    
    public String toString(){
        String s = "";
        s+= this.telefone+"\n"+this.mensagem;
        return s;
    }
    
}
