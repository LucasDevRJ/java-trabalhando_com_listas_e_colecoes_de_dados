/**
 * 1. Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
 * 2. Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida,
 *    crie um objeto da classe Cachorro e faça o casting para a classe Animal.
 * 3. Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja
 *    do tipo correto antes de fazer o casting.
 * 4. Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos
 *    e utilize um loop para calcular e imprimir o preço médio dos produtos.
 * 5. Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, por exemplo,
 *    Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma)
 *    e utilize um loop para calcular e imprimir a área de cada forma.
 * 6. Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida,
 *    crie uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar
 *    e imprimir a conta com o maior saldo.
 */

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

        System.out.println("---------------------------------------");
        Cachorro cachorro = new Cachorro(
                "Thor", "Canis Lupus Familiaris", 'M', 3, 18.5, "Marrom",
                "Labrador", "Grande", "Dourada", "Curta", "Longa",
                true
                );
        System.out.println(cachorro);
        cachorro.latir();
        cachorro.abanarRabo();

        Animal animal = cachorro;
        if (animal instanceof Cachorro) {
            animal = cachorro;
            System.out.println("Esse animal é um cachorro");
            System.out.println(animal);
            animal.comer();
            animal.dormir();
            animal.locomover();
        }

        System.out.println("---------------------------------------");
        Produto produto1 = new Produto("Fone", 99.99);
        Produto produto2 = new Produto("Mouse", 54.99);
        Produto produto3 = new Produto("Monitor", 435.00);
        Produto produto4 = new Produto("Caixa de Som", 80.00);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        double somaDosPrecosDosProdutos = 0.0;
        int quantidadeDeProdutos = 0;
        double precoMedioDosProdutos = 0.0;
        for (Produto produto : produtos) {
            somaDosPrecosDosProdutos = somaDosPrecosDosProdutos + produto.getPreco();
            quantidadeDeProdutos++;
            System.out.println(produto);
        }
        precoMedioDosProdutos = somaDosPrecosDosProdutos / quantidadeDeProdutos;

        System.out.println(String.format("Preço médio dos produtos = R$%.2f", precoMedioDosProdutos));

        System.out.println("---------------------------------------");
        Quadrado quadrado1 = new Quadrado(3, 3);
        Quadrado quadrado2 = new Quadrado(5, 5);

        Circulo circulo1 = new Circulo(3.2);
        Circulo circulo2 = new Circulo(6.2);

        ArrayList<FiguraGeometrica> figuraGeometricas = new ArrayList<>();
        figuraGeometricas.add(quadrado1);
        figuraGeometricas.add(quadrado2);
        figuraGeometricas.add(circulo1);
        figuraGeometricas.add(circulo2);

        for (FiguraGeometrica figura: figuraGeometricas) {
            if (figura instanceof Circulo || figura instanceof Quadrado) {
                ((Forma) figura).calcularArea();
                System.out.println(figura);
            }
        }

        System.out.println("---------------------------------------");
        ContaBancaria contaBancaria1 = new ContaBancaria(324345, 435.67);
        ContaBancaria contaBancaria2 = new ContaBancaria(876576, 120.34);
        ContaBancaria contaBancaria3 = new ContaBancaria(945656, 620.34);
        ContaBancaria contaBancaria4 = new ContaBancaria(904534, 456.67);
        ContaBancaria contaBancaria5 = new ContaBancaria(453225, 320.50);

        ArrayList<ContaBancaria> contasBancarias = new ArrayList<>();
        contasBancarias.add(contaBancaria1);
        contasBancarias.add(contaBancaria2);
        contasBancarias.add(contaBancaria3);
        contasBancarias.add(contaBancaria4);
        contasBancarias.add(contaBancaria5);

        ContaBancaria contaComMaiorSaldo = contasBancarias.get(0);
        for (int i = 0; i < contasBancarias.size(); i++) {
            ContaBancaria contaAtual = contasBancarias.get(i);
            for (int j = 0; j < contasBancarias.size(); j++) {
                if (i != j) {
                    ContaBancaria contaAhSerComparada = contasBancarias.get(j);
                    if (contaComMaiorSaldo.getSaldo() < contaAhSerComparada.getSaldo()) {
                        contaComMaiorSaldo = contaAhSerComparada;
                        System.out.println("Conta atual = " + contaAtual);
                        System.out.println("Conta a ser comparada = " + contaAhSerComparada);
                        System.out.println("Maior saldo = " + contaComMaiorSaldo);

                    }
                }
            }
        }
        System.out.println("Conta com o maior saldo = " + contaComMaiorSaldo);
    }
}
