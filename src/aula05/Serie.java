package aula05;

//SubClasse de Conteudo - (HERANÇA)

public class Serie extends Conteudo{

    //atributo
    private int totalTemporada;

    //Construtor
    public Serie(String titulo, String genero, int duracaoMinutos, int totalTemporada) {
        super(titulo, genero, duracaoMinutos);
        this.totalTemporada = totalTemporada;
    }

    //get() e set()
    public int getTotalTemporada() {
        return totalTemporada;
    }

    public void setTotalTemporada(int totalTemporada) {
        if (totalTemporada > 0) {
            this.totalTemporada = totalTemporada;
        } else {
            System.out.println("ERRO, não foi possivel definir a TEMPORADA!");
        }
    }

    //Exibir dados da serie
    public void exibirDadosSerie() {
        System.out.println("=== EXIBIR DETALHES DA SERIE ===");
        System.out.println("Titulo" + this.getTitulo());
        System.out.println("Genêro: " + this.getGenero());
        System.out.println("Duração: " + this.getDuracaoMinutos());
        System.out.println("Temporadas: " + this.totalTemporada);
    }
}
