package IronMan;

public class Bota extends Dispositivo implements AccionesBota, AccionesPropulsores {

    public static Boolean botasDaniadas = false;

    public Bota() {
        super();
    }

    @Override
    public Float caminar(int tiempo) throws danioException {

        if ((Bota.botasDaniadas == false)) {
            Armadura.escribirConsola("Caminando " + tiempo + " tiempo");
            this.sufrirDanio();
            if (this.daniado == true) {
                Bota.botasDaniadas = true;
            }
            return (Dispositivo.consumo * tiempo);
        } else {
            Armadura.escribirConsola("No se pudo caminar, botas dañado.");
            //tirar exception
            throw new danioException("Las botas estan dañadas");
        }
    }

    @Override
    public Float correr(int tiempo) throws danioException {

        if (Bota.botasDaniadas == false) {
            Armadura.escribirConsola("Correr " + tiempo + " tiempo");
            this.sufrirDanio();
            if (this.daniado == true) {
                Bota.botasDaniadas = true;
            }
            return ((Dispositivo.consumo * tiempo) * 2);
        } else {
            Armadura.escribirConsola("No se pudo correr, botas dañadas");
            throw new danioException("Las botas estan dañadas");
        }
    }

    @Override
    public Float propulsar(int tiempo) throws danioException {
        if (Bota.botasDaniadas == false) {
            Armadura.escribirConsola("Propulsar " + tiempo + " tiempo");
            this.sufrirDanio();
            if (this.daniado == true) {
                Bota.botasDaniadas = true;
            }
            return ((Dispositivo.consumo * tiempo) * 3);
        } else {
            Armadura.escribirConsola("No se pudo propulsar, botas dañadas");
            throw new danioException("Las botas estan dañadas");
        }

    }

    @Override
    public Float volar(int tiempo) throws danioException {
        if (Bota.botasDaniadas == false) {
            Armadura.escribirConsola("Volar " + tiempo + " tiempo");
            this.sufrirDanio();
            if (this.daniado == true) {
                Bota.botasDaniadas = true;
            }
            return ((Dispositivo.consumo * tiempo) * 3);
        } else {
            Armadura.escribirConsola("No se pudo Volar, botas dañadas");
            throw new danioException("Las botas estan dañadas");
        }
    }
}
