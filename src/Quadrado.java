// Classe Quadrado que herda de Retangulo
public class Quadrado extends Retangulo {
    // Atributo lado
    private double lado;

    // Construtor com parâmetros
    public Quadrado(double lado, String cor) {
        super(lado, lado, cor); // Chama o construtor da superclasse
        this.lado = lado;
    }

    // Método setLado
    public void setLado(double lado) {
        this.lado = lado;
    }

    // Método getLado
    public double getLado() {
        return this.lado;
    }

    // Método toString que sobrescreve o método da superclasse
    @Override
    public String toString() {
        return "Quadrado de lado " + lado + " e cor " + getCor() + " com área " + area();
    }
}
