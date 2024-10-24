import java.util.Random;
public class Automovel {

    private String piloto;
    private String marca;
    private String modelo;
    private int distancia = 0;

    Random random = new Random();

    public Automovel(String piloto, String marca, String modelo) {
        this.piloto = piloto;
        this.marca = marca;
        this.modelo = modelo;
    }

    public static void imprimirBarreira() {
        System.out.println("============================================================================================================================================X");
    }

    public void imprimeCarro() {
        int numeroSorteado = random.nextInt(3) + 1;

        distancia += numeroSorteado;

        String espacoSoma = " ".repeat(distancia);

        System.out.print(
                espacoSoma + "       _______      \n" +
                        espacoSoma + "     //  ||\\ \\     \n" +
                        espacoSoma + " ___//___||_\\ \\___ \n" +
                        espacoSoma + "|    _ " + piloto + "     _  )\n" +
                        espacoSoma + "|___/ \\________/ \\_|\n" +
                        espacoSoma + "    \\_/        \\_/   \n"
        );

        System.out.println(" ");
    }

    public void imprimeDistancia() {
        System.out.println(piloto + " - " + marca + " " + modelo + " | distancia percorrida: " + distancia);
    }
    public int getDistancia() {
        return distancia;
    }
    public String getPiloto() {
        return piloto;
    }
}