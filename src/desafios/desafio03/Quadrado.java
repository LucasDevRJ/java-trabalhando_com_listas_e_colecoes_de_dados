package desafios.desafio03;

public class Quadrado extends FiguraGeometrica implements Forma {

    private double ladoHorizontal;
    private double ladoVertical;

    public Quadrado(double ladoHorizontal, double ladoVertical) {
        super.nome = "Quadrado";
        this.ladoHorizontal = ladoHorizontal;
        this.ladoVertical = ladoVertical;
    }

    @Override
    public double calcularArea() {
        super.area = ladoHorizontal * ladoVertical;
        return super.area;
    }

}
