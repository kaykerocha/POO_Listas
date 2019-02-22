package lista2.l02_exe12;

import java.util.ArrayList;

public class Celular {
    private String operadora;
    private Telefone telefone;
    private ArrayList<Chamada> registroChamadas = new ArrayList<>();
    private ArrayList<Mensagem> registroMensagens = new ArrayList<>();
    private ArrayList<Contato> contatos = new ArrayList<>();

    public Celular() {
    }

    public Celular(String operadora, Telefone telefone) {
        this.operadora = operadora;
        this.telefone = telefone;
    }
    
    public void realizarChamada(Chamada chamada){
        this.registroChamadas.add(chamada);
    }
    
    public void imprimeRegistroChamadas(){
        System.out.println("---Registro de chamadas---");
        for (Chamada rc : registroChamadas) {
            System.out.println(rc + "\n---------------------------");
        }
    }
    
    public void mandaMensagem(Mensagem mensagem){
        this.registroMensagens.add(mensagem);
    }
    
    public void imprimeRegristoMensagens(){
        
        System.out.println("---Registro de mensagens---");
        for (Mensagem rm : registroMensagens) {
            System.out.println(rm + "\n---------------------------------------");
        }
    }
    
    public void salvaContato(Contato contato){
        contatos.add(contato);
    }
    
    public void consultaContato(){
        System.out.println("\n---Contatos---");
        for (Contato c : contatos) {
            System.out.println(c);
        }
    }
    
    public String toString(){
        String s ="";
        s = s + "Celular: " + this.telefone + " - " + this.operadora;
        return s;
    }
    
//    ------------

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
    
    public Telefone getTelefone() {
        return telefone;
    }
    
    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    
    public ArrayList<Chamada> getRegistroChamadas() {
        return registroChamadas;
    }
    
    public void setRegistroChamadas(ArrayList<Chamada> registroChamadas) {
        this.registroChamadas = registroChamadas;
    }
    
    public ArrayList<Mensagem> getRegistroMensagens() {
        return registroMensagens;
    }
    
    public void setRegistroMensagens(ArrayList<Mensagem> registroMensagens) {
        this.registroMensagens = registroMensagens;
    }
    
    public ArrayList<Contato> getContatos() {
        return contatos;
    }
    
    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }
    
}
