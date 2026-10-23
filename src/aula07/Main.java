package aula07;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {

        //1. Tentar instanciar a classe abstrata gera erro de compilação
        //Voluntario v = new Voluntario("Ana", "ana@email.com");

        //2. Criando instâncias das classes concretas
        DentistaVoluntario dentista = new DentistaVoluntario("Dra.Maria", "maria@email.org", "SP-123456", 4);
        EducadorVoluntario educador = new EducadorVoluntario("Pedro", "pedro@email.org", 2);

        //3. Exercutando os métodos de FORMA DIRETA
        //System.out.println("--- VOLUNTÁRIO 1 ---" );
        //System.out.println(dentista.getInfo());
        //dentista.realizarAcao();
        //System.out.println("Horas: " + dentista.calcularHorasDedicadas() + "h\n");

        //System.out.println("--- VOLUNTÁRIO 2 ---" );
        //System.out.println(educador.getInfo());
        //educador.realizarAcao();
        //System.out.println("Horas: " + educador.calcularHorasDedicadas() + "h\n");

        //O mesmo metodo imprimirRelatorio aceita qualquer filho de Voluntário
        imprimirRelatorio(dentista);
        imprimirRelatorio(educador);
    }

    //Metodo polimorfico: recebe a classe ABSTRATA como parâmetro
    public static  void imprimirRelatorio(Voluntario v) {
        System.out.println("--- RELATÓRIO ---");
        System.out.println(v.getInfo());
        v.realizarAcao(); //Executa o comportamento especifico da subclasse
        System.out.println("Horas: " + v.calcularHorasDedicadas() + "h\n");
        System.out.println("-------------------------------------\n");
    }
}
