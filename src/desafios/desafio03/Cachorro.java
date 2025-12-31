package desafios.desafio03;

public class Cachorro extends Animal {

    private String raca;
    private String porte;
    private String corPelagem;
    private String tipoPelagem;
    private String tamanhoDaCauda;
    private boolean castrado;

    public Cachorro(
            String nome, String especie, char sexo, int idade, double peso, String cor,
            String raca, String porte, String corPelagem, String tipoPelagem, String tamanhoDaCauda, boolean castrado
    ) {
        super(nome, especie, sexo, idade, peso, cor);
        this.raca = raca;
        this.porte = porte;
        this.corPelagem = corPelagem;
        this.tipoPelagem = tipoPelagem;
        this.tamanhoDaCauda = tamanhoDaCauda;
        this.castrado = castrado;
    }

    public void latir() {
        System.out.println(super.nome + " está latindo!");
    }

    public void abanarRabo() {
        System.out.println(super.nome + " começou a abanar o rabo.");
    }

    @Override
    public String toString() {
        return super.toString() + "{{Cachorro{" +
                "raca='" + raca + '\'' +
                ", porte='" + porte + '\'' +
                ", corPelagem='" + corPelagem + '\'' +
                ", tipoPelagem='" + tipoPelagem + '\'' +
                ", tamanhoDaCauda='" + tamanhoDaCauda + '\'' +
                ", castrado=" + castrado +
                "}}";
    }
}
