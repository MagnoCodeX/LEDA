package forma;

public class Quadrado extends Retangulo {
    
    public Quadrado(double lado) {
        super(lado, lado);
    }

    // Ele herda também os métodos públicos!!! E você aí pensando que o Quadrado
    // não seria capaz de calcular a área, hein otário...
}
