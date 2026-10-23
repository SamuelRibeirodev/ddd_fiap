package aula07;

//Dentista deve implementar os metodos abstratos da super classe
public class DentistaVoluntario extends Voluntario {

    private String cro;
    private int consultasRealizada;

    public DentistaVoluntario(String nome, String email, String cro, int consultasRealizada) {
        super(nome, email);
        this.cro = cro;
        this.consultasRealizada = consultasRealizada;

    }

    @Override
    public void realizarAcao() {
        System.out.println("Realizando atendimento adontológico com CRO: " + this.cro);
    }

    @Override
    public double calcularHorasDedicadas() {
        return this.consultasRealizada * 1.5; //Média de atendimento em horas (1.5 horas por consulta)
    }
}
