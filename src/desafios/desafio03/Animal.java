package desafios.desafio03;

public class Animal {

    protected String nome;
    private String especie;
    private char sexo;
    private int idade;
    private double peso;
    private String cor;

    public Animal(String nome, String especie, char sexo, int idade, double peso, String cor) {
        this.nome = nome;
        this.especie = especie;
        this.sexo = sexo;
        this.idade = idade;
        this.peso = peso;
        this.cor = cor;
    }

    public void comer() {
        System.out.println("O animal " + nome + " está comendo.");
    }

    public void dormir() {
        System.out.println("O animal " + nome + " está dormindo.");
    }

    public void locomover() {
        System.out.println(nome + " está se locomovendo.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", sexo=" + sexo +
                ", idade=" + idade +
                ", peso=" + peso +
                ", cor='" + cor + '\'' +
                '}';
    }
}
