package desafios.desafio03;

public class FiguraGeometrica {

    protected String nome;
    protected double area;

    @Override
    public String toString() {
        return """
                ----------|Área do %s|----------
                Área = %.2fcm²
                --------------------------------
                """.formatted(nome, area);
    }
}
