package revisaopoo;

//  Crie uma classe Retangulo que herda de Forma, tem os atributos largura e altura, e implementa calcularArea().

public class Retangulo extends Forma{

    double largura;
    double altura;

    public Retangulo(String nome, double largura, double altura) {
        super(nome);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
