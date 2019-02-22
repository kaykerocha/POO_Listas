package lista2.l02_exe12;

public class Telefone {
    private int ddd;
    private int numero;

    public Telefone() {
    }

    public Telefone(int ddd, int numero) {
        this.ddd = ddd;
        this.numero = numero;
    }
    
    public String toString(){
        return "("+this.ddd+")"+this.numero;
    }
}
