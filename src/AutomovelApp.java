public class AutomovelApp {

    public static void main(String[] args) {

        Automovel[] carro = new Automovel[2];

        // (piloto = 4 letras no maximo), marca, modelo
        carro[0] = new Automovel("DAVI", "BMW", "X1");
        carro[1] = new Automovel("CAIQ", "CIVIC", "G10");

        boolean corridaFinalizada = false;

        while (!corridaFinalizada) {
            Automovel.imprimirBarreira();

            for (int c = 0; c < 2; c++) {
                carro[c].imprimeCarro();
            }

            Automovel.imprimirBarreira();

            for (int i = 0; i < 2; i++) {
                carro[i].imprimeDistancia();
            }

            if (carro[0].getDistancia() >= 120 || carro[1].getDistancia() >= 120) {
                corridaFinalizada = true;
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (carro[0].getDistancia() >= 120 && carro[1].getDistancia() >= 120) {
            System.out.println("EMPATE!");
        } else if (carro[0].getDistancia() >= 120) {
            System.out.println("Piloto 1 (" + carro[0].getPiloto() + ") GANHOU!");
        } else {
            System.out.println("Piloto 2 (" + carro[1].getPiloto() + ") GANHOU!");
        }
    }
}