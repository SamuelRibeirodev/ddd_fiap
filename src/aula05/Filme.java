package aula05;

public class Filme extends Conteudo {

    //atributo
    private boolean indicacaoOscar;

    //construtor
    public Filme(String titulo, String genero, int duracaoMinutos, boolean temOscar) {
        super(titulo, genero, duracaoMinutos);
        this.indicacaoOscar = indicacaoOscar;
    }

    //get() e set()
    public boolean isindicacaoOscar() {
        return indicacaoOscar;
    }

    public void setindicacaoOscar(boolean indicacaoOscar) {
        this.indicacaoOscar = indicacaoOscar;
    }

    //Exibir os dados do filme
    public void exibirDadosFilme() {
        System.out.println("=== EXIBIR DETALHES DO FILME ===");

        //atenção: usamos o metodo getTitulo() porque o atributo titulo é privado e ele esta em outra classe
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Genêro: " + this.getGenero());
        System.out.println("Duração: " + this.getDuracaoMinutos());

        if (this.indicacaoOscar) {
            System.out.println("Filme indicado para o OSCAR!");
        } else {
            System.out.println("Filme nao foi indicado para o OSCAR!");
        }
    }
}
