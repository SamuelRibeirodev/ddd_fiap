package aula4;

public class TesteControleRemoto {
    public static void main(String[] args) {

        //Criar um objeto de Controle Remoto (construtor vazio)
        ControleRemoto controle = new ControleRemoto();

        System.out.println("*** Controle Remoto ***");
        System.out.println("Ligado: " + controle.isLigado());
        System.out.println("Volume: " + controle.getVolume());

        System.out.println("--- Teste 1 ---");
        controle.setVolume(300);
        System.out.println("Volume: " + controle.getVolume());

        System.out.println("--- Teste 2 ---");
        controle.LigarDesligar();
        System.out.println("Ligado: " + controle.isLigado());

        System.out.println("--- Teste 3 ---");
        controle.aumentarVolume();
        controle.aumentarVolume();
        System.out.println("Volume: " + controle.getVolume());

        System.out.println("--- Teste 4 ---");
        controle.diminuirVolume();
        controle.diminuirVolume();
        controle.diminuirVolume();
        System.out.println("Volume: " + controle.getVolume());

    }
}
