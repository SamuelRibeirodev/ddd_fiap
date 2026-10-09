package aula05;

// Super Classe: Conteudo

public class Conteudo {

    //atributos
    private String titulo;
    private String genero;
    private int duracaoMinutos;

    //Construtor da super classe
    public Conteudo(String titulo, String genero, int duracaoMinutos) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracaoMinutos = duracaoMinutos;
    }

    //Getters and Setters
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

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        if (duracaoMinutos > 0) {
            this.duracaoMinutos = duracaoMinutos;
        } else {
            System.out.println("ERRO: o tempo de duração deve ser positivo");
        }
    }

    //Metodo comum que ambas as filhas herdarão
    public void darPlay() {
        System.out.println("O conteudo: " + this.titulo + " está carregando...");
        System.out.println("AEEEEEEE..... carregando em 3min!");
    }
}
