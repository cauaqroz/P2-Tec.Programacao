public class App {
    public static void main(String[] args) throws Exception {
         // Criando objetos das classes
        Circulo c1 = new Circulo(5, "azul");
        Triangulo t1 = new Triangulo(3, 4, "verde");
        Retangulo r1 = new Retangulo(6, 8, "amarelo");
        
        // Imprimindo as informações dos objetos
        System.out.println(c1);
        System.out.println(t1);
        System.out.println(r1);
    }
}
