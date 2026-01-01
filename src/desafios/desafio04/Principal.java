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
    }
}
