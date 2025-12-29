/**
 * 1. Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida,
 * crie uma lista de objetos Produto utilizando a classe ArrayList. Adicione alguns produtos,
 * imprima o tamanho da lista e recupere um produto pelo índice.
 * 2. Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto.
 * Em seguida, imprima a lista de produtos utilizando o método System.out.println().
 * 3. Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos.
 * Em seguida, crie objetos Produto utilizando esse novo construtor.
 * 4. Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade
 * e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados.
 * Crie um objeto ProdutoPerecivel e imprima seus valores.
 */

package desafios.desafio02;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return """
                ----------|PRODUTO|----------
                Nome: %s
                Preço: R$%.2f
                Quantidade: %d
                """.formatted(nome, preco, quantidade);
    }
}
