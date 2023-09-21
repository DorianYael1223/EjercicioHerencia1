package EjerciciosHerencia;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nombreFigura, double base, double altura) {
        super(nombreFigura);

        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("La base y la altura deben ser valores positivos y diferentes de cero.");
        }

        this.base = base;
        this.altura = altura;
    }

    @Override
    public double CalcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double CalcularPerimetro() {
       return base + (2 * altura);
    }
}
