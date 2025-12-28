package desafios.desafio01;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Lucas");
        pessoa1.setIdade(26);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("George");
        pessoa2.setIdade(20);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Miguel");
        pessoa3.setIdade(32);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Na lista tem " + listaDePessoas.size() + " pessoas.");
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));
        System.out.println("Lista completa: " + listaDePessoas);
    }
}
