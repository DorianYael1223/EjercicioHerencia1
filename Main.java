package EjerciciosHerencia;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat format1 = new DecimalFormat("#.00");
        FiguraGeometrica[] figuras = new FiguraGeometrica[3];

        System.out.println("Tabla de áreas y perímetros:");
        System.out.println("|--------------|----------|----------|");
        System.out.println("|    Figura    |   Área   | Perímetro|");
        System.out.println("|--------------|----------|----------|");

        try {
            figuras[0] = new Circulo("Circulo", -15); // Generará una excepción debido al valor negativo
        } catch (IllegalArgumentException e) {
            System.out.println("Se ha producido un error al crear una figura: " + e.getMessage());
        }

        try {
            figuras[1] = new Rectangulo("Rectangulo", 15.5, 30.3);
        } catch (IllegalArgumentException e) {
            System.out.println("Se ha producido un error al crear una figura: " + e.getMessage());
        }

        try {
            figuras[2] = new Triangulo("Triangulo", 0, 8.3); // Generará una excepción debido al valor igual a cero
        } catch (IllegalArgumentException e) {
            System.out.println("Se ha producido un error al crear una figura: " + e.getMessage());
        }

        for (FiguraGeometrica figura : figuras) {
            if (figura != null) {
                double area = figura.CalcularArea();
                double perimetro = figura.CalcularPerimetro();

                System.out.printf("| %-12s | %8s | %8s |%n", figura.nombreFigura, format1.format(area), format1.format(perimetro));
                System.out.println("|--------------|----------|----------|");
            }
        }
    }
}