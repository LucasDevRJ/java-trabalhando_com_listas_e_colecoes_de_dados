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
                -----------------------------
                """.formatted(nome, preco, quantidade);
    }
}
