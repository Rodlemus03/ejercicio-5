public class Pasadores extends Jugador {
    private int pases;
    private int fintas;
    private String posicion="pasador";
    //Constructor
    public Pasadores(String nombre, String pais, int errores, int aces, int servicios, int pases, int fintas){
        super(nombre, pais, errores, aces, servicios,"pasador");
        this.pases=pases;
        this.fintas=pases;
    }
    //get Posicion --String
    public String getPosicion(){return this.posicion;}
    //get efectividad --double
    public double getEfectividad(){
        int pases=this.pases;
        int fintas=this.fintas;
        int errores=super.getErrores();
        int aces=super.getAces();
        int servicios=super.getServicios();
        double resultado=0;
        resultado=((pases + fintas-errores) * 100 / (pases + fintas + errores)) + aces * 100 / servicios;
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
        cadena+="Pases: "+this.pases+"\n";
        cadena+="Fintas: "+this.fintas+"\n";
        return cadena;
    }
}
