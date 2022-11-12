package IronMan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Armadura {

    private String colorPrimario;

    private String colorSecundario;

    private Guante guanteIzq;

    private Guante guanteDer;

    private Bota botaIzq;

    private Bota botaDer;

    private Float energia;

    private Casco casco;

    //atributo auxiliar.
    Scanner leer = new Scanner(System.in);

    //Constructor.
    public Armadura(String color1, String color2) {
        this.colorPrimario = color1;
        this.colorSecundario = color2;

        // Inicializa La armadura
        this.guanteIzq = new Guante();
        this.guanteDer = new Guante();
        this.botaDer = new Bota();
        this.botaIzq = new Bota();
        this.casco = new Casco();

        //Inicializa Energia en el valor maximo de Float.
        this.energia = Float.MAX_VALUE;

    }

    // METODOS
    public void verEnergia() {
        float porcentaje = this.energia * (99) / Float.MAX_VALUE;

        //Escribir consola?
        System.out.println(porcentaje + "%");

    }

    public void actualizarPorcentaje(Float consumo) {
        Float porcentaje = consumo * (99) / Float.MAX_VALUE;
        //System.out.println(String.valueOf(porcentaje)+ "%");
        System.out.println(porcentaje.toString() + "%");
    }

    public Armadura() {
    }

    public void caminar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantida de tiempo que desea caminar:");

        int tiempo;
        do {

            try {
                tiempo = leer.nextInt();

            } catch (InputMismatchException e) {
                System.err.println("No es un numero");
                tiempo = 0;
            }

        } while (tiempo <= 0);

        Float consumoTotal = 0f;
        try {
            consumoTotal = this.botaDer.caminar(tiempo);
            consumoTotal = consumoTotal + this.botaIzq.caminar(tiempo);
        } catch (danioException e) {
            System.err.println(e.getMessage());
            consumoTotal = 0f;
        }

        if (consumoTotal > this.energia) {
            System.out.println("No le da la nasta.");
        } else {
            this.energia = this.energia - consumoTotal;
        }

    }

    public void correr() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantida de tiempo que desea correr:");

        int tiempo;
        do {

            try {
                tiempo = leer.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("No es un numero");
                tiempo = 0;
            }

        } while (tiempo <= 0);

        Float consumoTotal = 0f;

        try {
            consumoTotal = this.botaDer.correr(tiempo);
            consumoTotal = consumoTotal + this.botaIzq.correr(tiempo);
        } catch (danioException e) {
            // Atrapar exception y consumoTotal = 0;
            System.err.println(e.getMessage());
            consumoTotal = 0f;
        }

        if (consumoTotal > this.energia || consumoTotal == 0f) {
            System.out.println("No se pudo correr");
        } else {
            this.energia = this.energia - consumoTotal;
        }

    }

    public void propulsar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantida de tiempo que desea propulsar:");

        int tiempo;
        do {

            try {
                tiempo = leer.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("No es un numero");
                tiempo = 0;
            }

        } while (tiempo <= 0);

        Float consumoTotal = 0f;

        try {
            consumoTotal = this.botaDer.propulsar(tiempo);
            consumoTotal = consumoTotal + this.botaIzq.propulsar(tiempo);
        } catch (danioException e) {
            // Atrapar exception y consumoTotal = 0;
            System.err.println(e.getMessage());
            consumoTotal = 0f;
        }

        if (consumoTotal > this.energia || consumoTotal == 0f) {
            System.out.println("No se pudo propulsar");
        } else {
            this.energia = this.energia - consumoTotal;
        }

    }

    public void volar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantida de tiempo que desea volar:");

        int tiempo;
        do {

            try {
                tiempo = leer.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("No es un numero");
                tiempo = 0;
            }

        } while (tiempo <= 0);

        Float consumoTotal = 0f;

        try {
            consumoTotal = this.botaDer.propulsar(tiempo);
            consumoTotal = consumoTotal + this.botaIzq.propulsar(tiempo);
            // agregar guantes x2
            
        } catch (danioException e) {
            // Atrapar exception y consumoTotal = 0;
            System.err.println(e.getMessage());
            consumoTotal = 0f;
        }

        if (consumoTotal > this.energia || consumoTotal == 0f) {
            System.out.println("No se pudo volar. La energia no disminuyo");
        } else {
            this.energia = this.energia - consumoTotal;
        }

    }

    public void mostrarBateria() {
    }

    public void reparDanio() {
    }

    public void revisarDispositivos() {
    }

    // GETTERS & SETTERS 
    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Guante getGuanteIzq() {
        return guanteIzq;
    }

    public void setGuanteIzq(Guante guanteIzq) {
        this.guanteIzq = guanteIzq;
    }

    public Guante getGuanteDer() {
        return guanteDer;
    }

    public void setGuanteDer(Guante guanteDer) {
        this.guanteDer = guanteDer;
    }

    public Bota getBotaIzq() {
        return botaIzq;
    }

    public void setBotaIzq(Bota botaIzq) {
        this.botaIzq = botaIzq;
    }

    public Bota getBotaDer() {
        return botaDer;
    }

    public void setBotaDer(Bota botaDer) {
        this.botaDer = botaDer;
    }

    public Float getEnergia() {
        return energia;
    }

    public void setEnergia(Float energia) {
        this.energia = energia;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }

}
