package forma;

public class Retangulo implements Forma {

    protected double base;
    protected double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

}
