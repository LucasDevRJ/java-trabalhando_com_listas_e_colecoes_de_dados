/**
 * 1. Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.
 * 2. No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
 * 3. Adicione pelo menos três pessoas à lista utilizando o método add.
 * 4. Imprima o tamanho da lista utilizando o método size.
 * 5. Imprima a primeira pessoa da lista utilizando o método get.
 * 6. Imprima a lista completa
 */

package desafios.desafio01;

public class Pessoa {

    private String nome;
    private int idade;

    @Override
    public String toString() {
        return "O nome da pessoa é " + nome + " e tem " + idade + " anos de idade.";
    }
}
