package aula4;

public class ControleRemoto {

    //1. atributos
    private boolean ligado;
    private int volume;
    private int canal;

    //2. construtores - vazio
    public ControleRemoto() {
        this.ligado = false;
        this.volume = 10;
        this.canal = 1;
    }

    //3. construtor - cheio
    public ControleRemoto(boolean ligado, int volume) {
        this.ligado = ligado;
        this.volume = volume;
        this.canal = canal;
    }

    //construtor
    public void mudarCanal(int novoCanal) {
        this.ligado = ligado;
        this.volume = volume;
        this.canal = canal;
    }

    //4. Getter e Setters
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        //validação simples com condicionais
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume alterado: " + volume);
        } else {
            System.out.println("Volume invalido");
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    //4. Metodos operacionais - Logica condicional

    //Metodo liga e desligar a tv
    public void LigarDesligar() {
        this.ligado = !this.ligado; // Inverte o valor do boolean
        if (this.ligado) {
            System.out.println("TV LIGADA");
        } else {
            System.out.println("TV DESLIGADA");
        }

    }

    //Aumentar volume (+ 1)
    public void aumentarVolume() {
        if (!this.ligado) {
            System.out.println("ERRO: TV DESLIGADA");
        } else if (volume > 100){
            System.out.println("Aviso: Volume Maximo");
        } else {
            //this.volume = this.volume + 1;
            //this.volume +=1;
            this.volume++;
        }

    }

    //Diminuir volume (- 1)
    public void diminuirVolume() {
    if(!this.ligado) {
        System.out.println("ERRO: TV DESLIGADA");
    } else if (this.volume <= 0){
        System.out.println("AVISO: A tv esta no minimo (0)");
    } else {
        this.volume --;
        System.out.println("Volume diminuindo para: " + this.volume);
    }
    }
}
