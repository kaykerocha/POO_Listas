package l01_exe01;

public class Exe01 {
    
    public static Integer maiorNumero(Integer a, Integer b){
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(maiorNumero(8, 4));
    }
    
}
