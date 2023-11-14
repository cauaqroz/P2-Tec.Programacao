// Classe Triângulo que herda de Figura
public class Triangulo extends Figura {
    // Atributos base e altura
    private double base;
    private double altura;

    // Construtor com parâmetros
    public Triangulo(double base, double altura, String cor) {
        super(cor); // Chama o construtor da superclasse
        this.base = base;
        this.altura = altura;
    }

    // Método setBase
    public void setBase(double base) {
        this.base = base;
    }

    // Método setAltura
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método getBase
    public double getBase() {
        return this.base;
    }

    // Método getAltura
    public double getAltura() {
        return this.altura;
    }

    // Método area que sobrescreve o método da superclasse
    @Override
    public double area() {
        return base * altura / 2;
    }

    // Método toString que sobrescreve o método da superclasse
    @Override
    public String toString() {
        return "Triângulo de base " + base + ", altura " + altura + " e cor " + getCor() + " com área " + area();
    }
}