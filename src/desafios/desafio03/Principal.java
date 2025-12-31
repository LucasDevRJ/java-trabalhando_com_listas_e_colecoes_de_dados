package desafios.desafio03;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> linguagensDeProgramacao = new ArrayList<>();
        linguagensDeProgramacao.add("Java");
        linguagensDeProgramacao.add("JavaScript");
        linguagensDeProgramacao.add("PHP");
        linguagensDeProgramacao.add("C");
        linguagensDeProgramacao.add("C++");

        System.out.println("Linguagens de Programação:");
        for (String linguagem : linguagensDeProgramacao) {
            System.out.println(linguagem);
        }
    }
}
