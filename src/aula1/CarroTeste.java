package aula1;

public class CarroTeste {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.marca = "Fiat";
        carro1.modelo = "uno";
        carro1.cor = "Azul";
        carro1.VelocidadeAtual = 0;

        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Cor: " + carro1.cor);
        System.out.println("VelocidadeAtual: " + carro1.VelocidadeAtual);

        System.out.println("\n------------------------------------------\n");

        Carro carro2 = new Carro();

        carro2.marca = "Jeep";
        carro2.modelo = "Compass";
        carro2.cor = "Preto";
        carro2.VelocidadeAtual = 0;

        System.out.println("Marca: " + carro2.marca);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Cor: " + carro2.cor);
        System.out.println("VelocidadeAtual: " + carro2.VelocidadeAtual);

        System.out.println("\n------------------------------------------\n");

        System.out.println("Ações do carro" + carro1.modelo);
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        System.out.println("Velocidade atual: " + carro1.VelocidadeAtual);
        carro1.frear();
        System.out.println("Velocidade atual: " + carro1.VelocidadeAtual) ;

        System.out.println("\n------------------------------------------\n");

        carro2.acelerar();
        carro2.acelerar();
        carro2.frear();
        System.out.println("Velocidade atual: " + carro2.VelocidadeAtual);
    }

}
