package desafios.desafio02;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Celular", 1199.99, 12);
        Produto produto2 = new Produto("Televisão", 670.00, 23);
        Produto produto3 = new Produto("PlayStation 4", 1799.99, 30);
        Produto produto4 = new Produto("Computador", 2999.99, 15);

        ProdutoPerecivel produtoPerecivel =
                new ProdutoPerecivel("Chocolate", 9.99, 20, "10/10/2026");

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        listaDeProdutos.add(produto4);
        listaDeProdutos.add(produtoPerecivel);

        System.out.println("A lista tem " + listaDeProdutos.size() + " produtos.");

        for (int i = 0; i < listaDeProdutos.size(); i++) {
            System.out.println(listaDeProdutos.get(i));
        }
    }
}
