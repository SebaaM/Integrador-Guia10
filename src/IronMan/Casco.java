package IronMan;

public class Casco {

    private static Consola consola;

    private static Sintetizador sintetizador;
    
    
    public Casco() {
        this.consola = new Consola();
        this.sintetizador= new Sintetizador();
    }

    public void leer() {
        
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public Sintetizador getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(Sintetizador sintetizador) {
        this.sintetizador = sintetizador;
    }
    
    
    
}
