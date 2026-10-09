package aula1;

public class Carro {

    //Atributos
     String marca;
     String modelo;
     String cor;
     int VelocidadeAtual;

     //Métodos
    void acelerar() {
        System.out.println("Acelerando....");
        VelocidadeAtual = VelocidadeAtual + 10;
        System.out.println("O carro acelerou! Velocidade atual: " + VelocidadeAtual + "km/h");
    }

    void frear() {
        System.out.println("Freando.....");
        VelocidadeAtual = VelocidadeAtual - 10;
        System.out.println("O carro freou! Velocidade atual: " + VelocidadeAtual + "km/h");
    }


}
