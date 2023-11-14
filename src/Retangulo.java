// Classe Retângulo que herda de Figura
public class Retangulo extends Figura {
    // Atributos lado1 e lado2
    private double lado1;
    private double lado2;

    // Construtor com parâmetros
    public Retangulo(double lado1, double lado2, String cor) {
        super(cor); // Chama o construtor da superclasse
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Método setLado1
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    // Método setLado2
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    // Método getLado1
    public double getLado1() {
        return this.lado1;
    }

    // Método getLado2
    public double getLado2() {
        return this.lado2;
    }

    // Método area que sobrescreve o método da superclasse
    @Override
    public double area() {
        return lado1 * lado2;
    }

    // Método toString que sobrescreve o método da superclasse
    @Override
    public String toString() {
        return "Retângulo de lados " + lado1 + " e " + lado2 + " e cor " + getCor() + " com área " + area();
    }
}
