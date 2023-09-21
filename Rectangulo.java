package EjerciciosHerencia;

public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(String nombreFigura, double base, double altura) {
        super(nombreFigura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double CalcularArea() {
        return altura * base;
    }
    @Override
    public double CalcularPerimetro() {
        return 2 * (base + altura);
    }

}
