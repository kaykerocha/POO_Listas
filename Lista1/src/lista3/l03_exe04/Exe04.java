package lista3.l03_exe04;

import java.util.Scanner;

public class Exe04 {
    
    public static void a(char[][] matriz){
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                if (l>=c) {
                    matriz[l][c] = '#';
                }else{
                    matriz[l][c] = ' ';
                }
            }
        }
        System.out.println("A)");
        imprimir(matriz);
        System.out.println("------------------------");
    }
    
    public static void b(char[][] matriz){
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                if (l+c < matriz.length) {
                    matriz[l][c] = '#';
                }else{
                    matriz[l][c] = ' ';
                }
            }
        }
        System.out.println("B)");
        imprimir(matriz);
        System.out.println("------------------------");
    }
    
    public static void c(char[][] matriz){
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                if (l<=c) {
                    matriz[l][c] = '#';
                }else{
                    matriz[l][c] = ' ';
                }
            }
        }
        System.out.println("C)");
        imprimir(matriz);
        System.out.println("------------------------");
    }
    
    public static void d(char[][] matriz){
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                if (l+c+1 >= matriz.length) {
                    matriz[l][c] = '#';
                }else{
                    matriz[l][c] = ' ';
                }
            }
        }
        System.out.println("D)");
        imprimir(matriz);
        System.out.println("------------------------");
    }
    
    public static void e(char[][] matriz){
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                if (l==0 || c==0 || l == matriz.length-1 || c==matriz.length-1) {
                    matriz[l][c] = '#';
                }else{
                    matriz[l][c] = ' ';
                }
            }
        }
        System.out.println("E)");
        imprimir(matriz);
        System.out.println("------------------------");
    }
    
    public static void f(char[][] matriz){
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                if (l==0 || l == matriz.length-1 || l==c) {
                    matriz[l][c] = '#';
                }else{
                    matriz[l][c] = ' ';
                }
            }
        }
        System.out.println("F)");
        imprimir(matriz);
        System.out.println("------------------------");
    }
    
    public static void g(char[][] matriz){
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                if (l==0 || l == matriz.length-1 || l+c+1 == matriz.length) {
                    matriz[l][c] = '#';
                }else{
                    matriz[l][c] = ' ';
                }
            }
        }
        System.out.println("G)");
        imprimir(matriz);
        System.out.println("------------------------");
    }
    
    public static void h(char[][] matriz){
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                if (l==0 || l == matriz.length-1 || l+c+1 == matriz.length || l==c) {
                    matriz[l][c] = '#';
                }else{
                    matriz[l][c] = ' ';
                }
            }
        }
        System.out.println("H)");
        imprimir(matriz);
        System.out.println("------------------------");
    }
    
    public static void i(char[][] matriz){
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                if (l==0 || c==0 || l == matriz.length-1 || c==matriz.length-1 || l+c+1 == matriz.length || l==c ) {
                    matriz[l][c] = '#';
                }else{
                    matriz[l][c] = ' ';
                }
            }
        }
        System.out.println("I)");
        imprimir(matriz);
        System.out.println("------------------------");
    }
    
    public static void imprimir(char[][] matriz){
        for (char[] matriz1 : matriz) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.print(matriz1[c] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
//        int n = 20;
        char[][] matriz = new char[n][n];
        
        a(matriz);
        b(matriz);
        c(matriz);
        d(matriz);
        e(matriz);
        f(matriz);
        g(matriz);
        h(matriz);
        i(matriz);
        
    }
}
