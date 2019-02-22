package lista2.l02_exe07;

import java.util.ArrayList;

public class Teste {
    
    public static double[] valores(ArrayList<Departamento> dep){
        double[] lista = new double[dep.size()];
        for (int i = 0; i < dep.size(); i++) {
            for (Produto p : dep.get(i).getProdutos()) {
                lista[i] = lista[i] + p.getPreco();
            }
        }
//        for (int i = 0; i < lista.length; i++) {
//            System.out.println(lista[i]);
//        }
        return lista;
    }
    
    public static void main(String[] args) {
        ArrayList<Departamento> dep = new ArrayList<>();
        
        dep.add(new Departamento("Esportivo", "Produtos esportivos"));
        dep.add(new Departamento("Alimenticio", "Produtos alimenticios"));
        dep.add(new Departamento("Limpeza", "Produtos de limpeza"));
        
        Produto p = new Produto();
        
        dep.get(0).addProduto(new Produto("Bola", 50.00, dep.get(0)));
        dep.get(0).addProduto(new Produto("Chuteira", 150.00, dep.get(0)));
        
        dep.get(1).addProduto(new Produto("Carne", 10.00, dep.get(1)));
        dep.get(1).addProduto(new Produto("Bolacha", 4.00, dep.get(1)));
        
        dep.get(2).addProduto(new Produto("Detergente", 50.00, dep.get(2)));
        dep.get(2).addProduto(new Produto("Sabão em pó", 150.00, dep.get(2)));
        
        for (Departamento d : dep) {
            System.out.println("---"+d.getNome()+"---");
            for (Produto pro : d.getProdutos()) {
                if (pro.getDepartamento().getNome().equals(d.getNome())) {
                    System.out.println(pro);
                }
            }
        }
        
//        System.out.println(valores(dep));
        
    }
    
}
