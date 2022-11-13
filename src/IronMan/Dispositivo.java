package IronMan;

public abstract class Dispositivo {

    protected Integer salud;

    protected Integer resistencia;

    // asigna el consumo basico de toda accion.
    protected static final Float consumo= (Float.MAX_VALUE/10000);

    public Boolean daniado;

    public Boolean destruido;

    public Dispositivo() {
        this.salud= 100;
        this.resistencia = 100;
        this.daniado = false;
        this.destruido = false;
    }

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }

    public Integer getResistencia() {
        return resistencia;
    }

    public void setResistencia(Integer resistencia) {
        this.resistencia = resistencia;
    }

    public Boolean getDaniado() {
        return daniado;
    }

    public void setDaniado(Boolean daniado) {
        this.daniado = daniado;
    }

    public Boolean getDestruido() {
        return destruido;
    }

    public void setDestruido(Boolean destruido) {
        this.destruido = destruido;
    }

    
    //METODOS
    
    public Boolean mostrarEstado() {
        return this.daniado;
    }

    public void sufrirDanio() {
        Long a =  Math.round(Math.random()*100);
        if (a <= 30) {
            this.daniado=true;
            //Casco.consola.escribir ("El dispositivo se daño.")
            Armadura.escribirConsola("El dispositivo se daño.");
            this.repararDanio();
            //this.salud -= 25; // resta 25 de salud.
        }
        
    }
    
    public void repararDanio () {
        Armadura.escribirConsola("Reparando daños..");
        Long a =  Math.round(Math.random()*100);
        if (a <= 40) {
            this.daniado=false;
            Armadura.escribirConsola("El dispositivo se reparó.");
        } else {
            Armadura.escribirConsola("El dispositivo no se pudo reparar.");
        }
        
    }

    public Boolean estaDestruido() {
        return this.destruido;
    }

}
