public class Auxiliares extends Jugador {
    private int ataques;
    private int bloquesEfectivos;
    private int bloquesFallido;
    private String posicion="pasador";
//CONSTRUCTOR
    public Auxiliares(String nombre, String pais, int errores, int aces, int servicios, int ataques, int bloquesEfectivos, int bloquesFallido){
        super(nombre, pais, errores, aces, servicios,"auxiliar");
        this.ataques=ataques;
        this.bloquesEfectivos=bloquesEfectivos;
        this.bloquesFallido=bloquesFallido;
    }
    //Get posicion
    public String getPosicion(){return this.posicion;}
    //Tostrings
    public String toString(){
        String cadena="";
        cadena+="Nombre: "+super.nombre+"\n";
        cadena+="Posicion: "+this.posicion;
        cadena+="Pais: "+super.pais+"\n";
        cadena+="Errores: "+super.errores+"\n";
        cadena+="Aces: "+super.aces+"\n";
        cadena+="Total servicios: "+super.totalServicios+"\n";
        cadena+="Ataques: "+this.ataques+"\n";
        cadena+="Bloqueos efectivos: "+this.bloquesEfectivos+"\n";
        cadena+="Bloqueos fallidos: "+this.bloquesFallido+"\n";
        return cadena;
    }
}
