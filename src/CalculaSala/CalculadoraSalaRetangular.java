package CalculaSala;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public double calcularArea(double a, double b) {
        return a * b;
    }

    @Override
    public double calcularPerimetro(double a, double b, double c) {
        return a + b + c;
    }
}