package forma;

public class CalculadoraAreas {
    public static void main(String[] args) {

        Forma triangulo = new Triangulo(5, 8);
        Forma circulo = new Circulo(2);
        Forma quadrado = new Quadrado(10);
        Forma retangulo = new Retangulo(10, 5);
        
        System.out.println("Área do triângulo: " + triangulo.area());
        System.out.println("Área do círculo: " + circulo.area());
        System.out.println("Área do quadrado: " + quadrado.area());
        System.out.println("Área do retângulo: " + retangulo.area());

    }
}
