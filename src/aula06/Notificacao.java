package aula06;

public class Notificacao {

    //atributos
    private String destinatario;
    private String mensagem;

    //Construtor
    public Notificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    //Gett e Setters
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    // Comportamento genérico que será sobrescrito (override)
    public void enviar() {
        System.out.println("Enviando uma mensagem (genérica) para " + this.destinatario);
    }
}
