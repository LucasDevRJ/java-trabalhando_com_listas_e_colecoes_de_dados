package desafios.desafio03;

public class Circulo extends FiguraGeometrica implements Forma {

    private double pi = Math.PI;
    private double raio;

    public Circulo(double raio) {
        super.nome = "Círculo";
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        super.area = pi * Math.pow(raio, 2);
        return super.area;
    }
}
