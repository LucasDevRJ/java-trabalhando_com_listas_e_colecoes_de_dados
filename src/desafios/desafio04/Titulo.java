package desafios.desafio04;

public class Titulo implements Comparable<Titulo> {

    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return nome.compareTo(outroTitulo.nome);
    }

}
