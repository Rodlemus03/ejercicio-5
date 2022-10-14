
public class Liberos extends Jugador {
    private int recibos=0;
    private String posicion="libero";

//Constructor
    public Liberos(String nombre, String pais, int errores, int aces, int servicios, int recibos){
        super(nombre, pais, errores, aces, servicios,"libero");
        this.recibos=recibos;
    }
    //get posicion--String
    public String getPosicion(){return this.posicion;}
    //get posicion -- double
    public double getEfectividad(){
        int recibos=this.recibos;
        int errores=super.getErrores();
        int aces=super.getAces();
        int servicios=super.getServicios();
        double resultado=0;
        resultado= ((recibos-errores) * 100 / (recibos + errores)) + aces * 100 / servicios;
        return resultado;
    }
    //toString --String
    public String toString(){

        String cadena="";
        cadena+="Nombre: "+super.nombre+"\n";
        cadena+="Posicion: "+this.posicion;
        cadena+="Pais: "+super.pais+"\n";
        cadena+="Errores: "+super.errores+"\n";
        cadena+="Aces: "+super.aces+"\n";
        cadena+="Total servicios: "+super.totalServicios+"\n";
        cadena+="Recibos: "+this.recibos;
        return cadena;
    }
    
}
