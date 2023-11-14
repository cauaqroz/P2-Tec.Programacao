// Classe Círculo que herda de Figura
public class Circulo extends Figura {
    
    // Atributo raio
    private double raio;
    // Constante PI
    private static final double PI = 3.14;
    // Construtor com parâmetros
    public Circulo(double raio, String cor) {
        super(cor); // Chama o construtor da superclasse
        this.raio = raio;
    }
    // Método setRaio
    public void setRaio(double raio) {
        this.raio = raio;
    }
    // Método getRaio
    public double getRaio() {
        return this.raio;
    }
    // Método area que sobrescreve o método da superclasse
    @Override
    public double area() {
        return PI * raio * raio;
    }
    // Método getDiametro
    public double getDiametro() {
        return 2 * raio;
    }
    // Método toString que sobrescreve o método da superclasse
    @Override
    public String toString() {
        return "Círculo de raio " + raio + " e cor " + getCor() + " com área " + area() + " e diâmetro "
                + getDiametro();
    }
}

