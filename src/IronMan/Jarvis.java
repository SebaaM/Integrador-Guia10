package IronMan;

public class Jarvis {

    private Armadura a;
    
    public Jarvis() {
        
        
    }
    
    
    public static void main(String[] args) {
        Float max = Float.MAX_VALUE;
        System.out.println(max);
        
        Float consumo = (Float.MAX_VALUE/100);
        System.out.println(consumo);
        
        System.out.println("energia restante."+(max - (consumo))); //99.01%
        float porcentaje =  consumo*(99) / max;
        System.out.println(porcentaje + "%");
        
        
        Long a =  Math.round(Math.random()*100);
        System.out.println(a);
    }
}
