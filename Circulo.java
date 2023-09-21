package EjerciciosHerencia;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String nombreFigura, double radio) {
        super(nombreFigura);

        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser un valor positivo.");
        }

        this.radio = radio;
    }

    @Override
    public double CalcularArea() {
        return Math.PI * (Math.pow(radio, 2));
    }

    @Override
    public double CalcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

