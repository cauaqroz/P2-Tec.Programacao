// Classe abstrata Figura
public abstract class Figura {
    // Atributo cor
    private String cor;

    // Construtor padrão
    public Figura() {
        this.cor = "branco";
    }

    // Construtor com parâmetro
    public Figura(String cor) {
        this.cor = cor;
    }

    // Método setCor
    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método getCor
    public String getCor() {
        return this.cor;
    }

    // Método abstrato area
    public abstract double area();
}