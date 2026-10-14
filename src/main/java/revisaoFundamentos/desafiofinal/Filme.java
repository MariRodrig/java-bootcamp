package revisaofundamentos.desafiofinal;

public class Filme {

    private String titulo;
    private String genero;
    private double nota;
    private String classificacao;

    public Filme(String titulo, String genero, double nota, String classificacao) {
        this.titulo = titulo;
        this.genero = genero;
        this.nota = nota;
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}
