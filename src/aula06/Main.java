package aula06;

public class Main {


    //Metodo que aceita QUALQUER Notificação - o coração do Polimorfismo
    public static void dispararAlerta(Notificacao notificacao) {
        System.out.println("\n [SISTEMA DE ALERTA]");
        notificacao.enviar(); // O java decide em tempo de execucão qual metodo enviar() sera chamado
    }

    public static void main(String[] args) {

        //Declaração de tipo genérico (Generics) apontando para instâncias especificas
        Notificacao n1 = new Email("aluno@fiap.com.br", "Cp realizado com sucesso", "Aviso importante");
        Notificacao n2 = new SMS("1199999-888", "Aula de hoje - Não se atrase");

        //Chamada direta
        n1.enviar();
        n2.enviar();

        //Usando o metodo Polimorfico sem condicionais
        dispararAlerta(n1);
        dispararAlerta(n2);

        //Usando o metodo Polimorfico com condicionais
        //1 - Email
        //2 - SMS
        int tipoCanal = 1;
        Notificacao notificacaoEscolhida = null;

        if(tipoCanal == 1) {
            notificacaoEscolhida = new Email("aluno2@fiap.com.br", "Alo, turma!", "Aula de Java");
        } else if (tipoCanal == 2) {
            notificacaoEscolhida = new SMS("1197777-111", "Aula de hoje - Estamos quase terminando");
        }

        // Não importa o tipo de dado Concreto, o metodo trata todos como notificacao
        dispararAlerta(notificacaoEscolhida);
    }
}
