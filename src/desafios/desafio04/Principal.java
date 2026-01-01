package desafios.desafio04;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> numerosInteiros = new ArrayList<>();
        numerosInteiros.add(37);
        numerosInteiros.add(28);
        numerosInteiros.add(12);
        numerosInteiros.add(41);
        numerosInteiros.add(3);
        numerosInteiros.add(82);
        numerosInteiros.add(45);

        System.out.println("Lista de números inteiros = " + numerosInteiros);
        Collections.sort(numerosInteiros);
        System.out.println("Lista de números inteiros em ordem crescente = " + numerosInteiros);

        Titulo titulo1 = new Titulo("The Matrix");
        Titulo titulo2 = new Titulo("O Cavaleiro das Trevas");
        Titulo titulo3 = new Titulo("Mad Max");
        Titulo titulo4 = new Titulo("De Volta para o Futuro");
        Titulo titulo5 = new Titulo("Corra");

        ArrayList<Titulo> titulos = new ArrayList<>();
        titulos.add(titulo1);
        titulos.add(titulo2);
        titulos.add(titulo3);
        titulos.add(titulo4);
        titulos.add(titulo5);

        System.out.println("Lista de Títulos = " + titulos);
        Collections.sort(titulos);
        System.out.println("Lista de Títulos em ordem alfabética = " + titulos);
    }
}
