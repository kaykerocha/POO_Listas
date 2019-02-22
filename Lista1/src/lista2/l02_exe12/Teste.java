package lista2.l02_exe12;

public class Teste {
    
    public static void main(String[] args) {
        
        Celular celular = new Celular("Vivo", new Telefone(66, 999190427));
        
        System.out.println(celular);
        
        Contato c1 = new Contato("Casa", "casa@casa.com");
        c1.addTelefone(new Telefone(66, 988887777));
        c1.addTelefone(new Telefone(66, 977778888));
        
        Contato c2 = new Contato("Trabalho", "trabalho@trabalho.com");
        c2.addTelefone(new Telefone(65, 955556666));
        
        celular.salvaContato(c1);
        celular.salvaContato(c2);
        
        celular.consultaContato();
        System.out.println("");
        
        celular.realizarChamada(new Chamada(new Telefone(66, 922223333), 37));
        celular.realizarChamada(new Chamada(new Telefone(65, 922224444), 47));
        celular.realizarChamada(new Chamada(new Telefone(64, 922225555), 57));
        celular.realizarChamada(new Chamada(new Telefone(63, 922226666), 67));
        
        celular.imprimeRegistroChamadas();
        
        celular.mandaMensagem(new Mensagem(new Telefone(50, 911112222), "Oi, tudo bem?"));
        celular.mandaMensagem(new Mensagem(new Telefone(51, 911113333), "Boa tarde!?"));
        celular.mandaMensagem(new Mensagem(new Telefone(52, 911114444), "Já está chegando?"));
        celular.mandaMensagem(new Mensagem(new Telefone(53, 911115555), "Eai, tirou quantos na prova de POO?"));
        System.out.println("");
        celular.imprimeRegristoMensagens();
    }
    
}
