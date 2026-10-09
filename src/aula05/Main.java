package aula05;

public class Main {
    public static void main(String[] args) {

        // 1. Instanciando e testando um Filme
        Filme meuFilme = new Filme("Interestelar", "Ficção Cientifica", 170, true);
        meuFilme.exibirDadosFilme();
        meuFilme.darPlay(); //método HERDADO

        System.out.println("\n===================================\n");

        // 2. Instanciar e testando uma Serie
        Serie minhaSerie = new Serie("Suits", "Drama", 50, 5);
        minhaSerie.exibirDadosSerie();
        minhaSerie.darPlay(); // O MESMO metodo HERDADO  rodando na Serie
    }
}
