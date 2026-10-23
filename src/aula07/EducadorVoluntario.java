package aula07;

public class EducadorVoluntario extends Voluntario{

    private int oficinasMinistradas;

    public EducadorVoluntario(String nome, String email, int oficinasMinistradas) {
        super(nome, email);
        this.oficinasMinistradas = oficinasMinistradas;
    }

    public int getOficinasMinistradas() {
        return oficinasMinistradas;
    }

    public void setOficinasMinistradas(int oficinasMinistradas) {
        this.oficinasMinistradas = oficinasMinistradas;
    }

    @Override
    public void realizarAcao() {
        System.out.println("Ministrando oficina de higiene bucal e prevenção.");
    }

    @Override
    public double calcularHorasDedicadas() {
        return oficinasMinistradas * 2.0; //Média de 2h por oficina
    }
}
