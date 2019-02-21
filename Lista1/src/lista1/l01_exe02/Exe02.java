package lista1.l01_exe02;

public class Exe02 {
    
    public static void verifica(String usuario, String nome){
        if (usuario.toLowerCase().equals(nome.toLowerCase())) {
            System.out.println("A senha não pode ser igual o nome!");
        } else {
            System.out.println("Senha ok!");
        }
    }
    
    public static void main(String[] args) {
        verifica("kayke", "kayke");
    }
}
