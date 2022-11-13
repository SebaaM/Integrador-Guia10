package IronMan;

public class Guante extends Dispositivo implements AccionesPropulsores {

    public static Boolean guantesDaniados = false;
    
    public Guante() {
        super();
    }

    @Override
    public Float volar(int tiempo) throws danioException {
        if (Guante.guantesDaniados == false) {
            Armadura.escribirConsola("Volar durante: " + tiempo + "tiempo");
            this.sufrirDanio();
            if (this.daniado == true) {
                Guante.guantesDaniados = true;
            }
            // consola.imprimirInformacion
            // consola.mostrarEnergia
            return ((Dispositivo.consumo * tiempo) * 2);
        } else {
            Armadura.escribirConsola("No se pudo Volar, guantes dañados");
            throw new danioException("Los guantes estan dañados");
        }
    }
    
    
}
