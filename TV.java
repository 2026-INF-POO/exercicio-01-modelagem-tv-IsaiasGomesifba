class TV {
    int tamanho;
    int volume;
    String marca;
    int voltagem;
    int canal;
    boolean ligada;

    TV(int tamanho, String marca, int voltagem) {
        this.tamanho = tamanho;
        this.marca = marca;
        this.voltagem = voltagem;
        volume = 5;
        canal = 1;
        ligada = false;
    }

    void ligar() {
        ligada = true;
        int consumo = voltagem * tamanho;
        System.out.println("TV ligada.");
        System.out.println("Consumo: " + consumo);
    }

    void desligar() {
        ligada = false;
        System.out.println("TV desligada.");
    }

    void aumentarVolume() {
        if (!ligada) {
            System.out.println("Ligue a TV primeiro!");
            return;
        }

        if (volume < 10) {
            volume++;
        }

        System.out.println("Volume: " + volume);
    }

    void diminuirVolume() {
        if (!ligada) {
            System.out.println("Ligue a TV primeiro!");
            return;
        }

        if (volume > 1) {
            volume--;
        }

        System.out.println("Volume: " + volume);
    }

    void subirCanal() {
        if (!ligada) {
            System.out.println("Ligue a TV primeiro!");
            return;
        }

        canal++;
        System.out.println("Canal: " + canal);
    }

    void descerCanal() {
        if (!ligada) {
            System.out.println("Ligue a TV primeiro!");
            return;
        }

        if (canal > 1) {
            canal--;
        }

        System.out.println("Canal: " + canal);
    }
}

class Main {
    public static void main(String[] args) {

        TV tv = new TV(50, "Samsung", 220);

        tv.ligar();
        tv.aumentarVolume();
        tv.subirCanal();
        tv.descerCanal();
        tv.desligar();
    }
}
