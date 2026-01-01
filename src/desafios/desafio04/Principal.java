/**
 * 1. Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente.
 *    Em seguida, imprima a lista ordenada.
 * 2. Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface Comparable na classe
 *    para que seja possível ordenar uma lista de objetos Titulo.
 * 3. No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o
 *    método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.
 * 4. Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList.
 *    Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.
 * 5. Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando
 *    o uso de polimorfismo.
 */

package desafios.desafio04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

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

        List<String> afazeresComArrayList = new ArrayList<>();
        afazeresComArrayList.add("Arrumar a cama");
        afazeresComArrayList.add("Escovar os dentes");
        afazeresComArrayList.add("Tomar café da manhã");
        System.out.println("Lista com Array List = " + afazeresComArrayList);

        List<String> afazeresComLinkedList = new LinkedList<>();
        afazeresComLinkedList.add("Almoço");
        afazeresComLinkedList.add("Trabalhar");
        afazeresComLinkedList.add("Tomar banho");
        System.out.println("Lista com Linked List = " + afazeresComLinkedList);

        List<String> tecnologias;
        tecnologias = new ArrayList<>();
        tecnologias.add("HTML");
        tecnologias.add("CSS");
        tecnologias.add("JavaScript");
        System.out.println("Tecnologias com ArrayList = " + tecnologias);

        tecnologias = new LinkedList<>();
        tecnologias.add("React");
        tecnologias.add("Angular");
        tecnologias.add("PostgreSQL");
        System.out.println("Tecnologias com LinkedList = " + tecnologias);
    }
}
