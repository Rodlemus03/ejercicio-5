import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Driver{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        //Listas de jugador general, solo liberos y solo pasadores.
        ArrayList <Jugador>jugadores=new ArrayList<Jugador>();
        //ArrayList <Liberos>liberos=new ArrayList<Liberos>();
        //ArrayList <Pasadores>pasadores=new ArrayList<Pasadores>();
        int respuesta=0;
        while(respuesta!=5){
            //Menu
            System.out.println("#####################################################");
            System.out.println("1. Ingresar jugador");
            System.out.println("2. Enlistar jugadores");
            System.out.println("3. Los 3 mejores liberos");
            System.out.println("4. La cantidad de pasadores con un 80% de efectividad");
            System.out.println("5. Salir");
            respuesta=teclado.nextInt();
            if(respuesta==1){
                //Ingresar un nuevo jugador
                int eleccion_puesto;
                System.out.println("Ingresa el numero de la posicion: ");
                System.out.println("1. Libero");
                System.out.println("2. Pasador");
                System.out.println("3. Opuesto");
                System.out.println("4. Auxiliar");
                eleccion_puesto=teclado.nextInt();
                //Decide la posicion de un jugador
                if(eleccion_puesto==1){
                    String nombre,pais;
                    int errores,aces,totalServicios,recibos;
                    System.out.println("Ingresa el nombre: ");
                    nombre=teclado.next();
                    System.out.println("Ingresa el pais: ");
                    pais=teclado.next();
                    System.out.println("Ingresa la cantidad de errores: ");
                    errores=teclado.nextInt();
                    System.out.println("Ingresa la cantidad de aces: ");
                    aces=teclado.nextInt();
                    System.out.println("Ingresa la cantidad de servicios: ");
                    totalServicios=teclado.nextInt();
                    System.out.println("Ingresa la cantidad de recibos: ");
                    recibos=teclado.nextInt();
                    //Crea el nuevo objeto
                    Liberos libero=new Liberos(nombre, pais, errores, aces, totalServicios, recibos);
                    //Agregar el objeto a las listas
                    jugadores.add(libero);  
                    //liberos.add(libero);
                }else if(eleccion_puesto==2){
                    String nombre,pais;
                    int errores,aces,totalServicios,pases,fintas;
                    System.out.println("Ingresa el nombre: ");
                    nombre=teclado.next();
                    System.out.println("Ingresa el pais: ");
                    pais=teclado.next();
                    System.out.println("Ingresa la cantidad de errores: ");
                    errores=teclado.nextInt();
                    System.out.println("Ingresa la cantidad de aces: ");
                    aces=teclado.nextInt();
                    System.out.println("Ingresa la cantidad de servicios: ");
                    totalServicios=teclado.nextInt();
                    System.out.println("Ingresa la cantidad de pases: ");
                    pases=teclado.nextInt();
                    System.out.println("Ingresa la cantidad de fintas: ");
                    fintas=teclado.nextInt();
                    //Crea el nuevo objeto
                    Pasadores pasador=new Pasadores(nombre, pais, errores, aces, totalServicios, pases, fintas);
                    //Ingresa el objeto a las listas
                    jugadores.add(pasador); 
                   // pasadores.add(pasador);
                }else if(eleccion_puesto==3){
                    String nombre,pais;
                    int errores,aces,totalServicios,ataques,bloquesFallido,bloquesEfectivos;
                    System.out.println("Ingresa el nombre: ");
                    nombre=teclado.next();
                    System.out.println("Ingresa el pais: ");
                    pais=teclado.next();
                    System.out.println("Ingresa la cantidad de errores: ");
                    errores=teclado.nextInt();
                    System.out.println("Ingresa la cantidad de aces: ");
                    aces=teclado.nextInt();
                    System.out.println("Ingresa la cantidad de servicios: ");
                    totalServicios=teclado.nextInt();
                    System.out.println("Ingresa la cantidad de ataques: ");
                    ataques=teclado.nextInt();
                    System.out.println("Ingresa la cantidad de bloqueos efectivos: ");
                    bloquesEfectivos=teclado.nextInt();
                    System.out.println("Ingresa la cantidad de bloqueos fallidos: ");
                    bloquesFallido=teclado.nextInt();
                    //Crea el nuevo objeto
                    Opuestos opuesto=new Opuestos(nombre, pais, errores, aces, totalServicios, ataques, bloquesEfectivos, bloquesFallido);
                    //Ingresa el objeto a su lista
                    jugadores.add(opuesto); 
                }else if(eleccion_puesto==4){
                    String nombre,pais;
                    int errores,aces,totalServicios,ataques,bloquesFallido,bloquesEfectivos;
                    System.out.println("Ingresa el nombre: ");
                    nombre=teclado.next();
                    System.out.println("Ingresa el pais: ");
                    pais=teclado.next();
                    System.out.println("Ingresa la cantidad de errores: ");
                    errores=teclado.nextInt();
                    System.out.println("Ingresa la cantidad de aces: ");
                    aces=teclado.nextInt();
                    System.out.println("Ingresa la cantidad de servicios: ");
                    totalServicios=teclado.nextInt();
                    System.out.println("Ingresa la cantidad de ataques: ");
                    ataques=teclado.nextInt();
                    System.out.println("Ingresa la cantidad de bloqueos efectivos: ");
                    bloquesEfectivos=teclado.nextInt();
                    System.out.println("Ingresa la cantidad de bloqueos fallidos: ");
                    bloquesFallido=teclado.nextInt();
                    //Crea el objeto
                    Auxiliares aux=new Auxiliares(nombre, pais, errores, aces, totalServicios, ataques, bloquesEfectivos, bloquesFallido);
                    //Ingresa el objeto a la lista
                    jugadores.add(aux); 
                }else{
                    System.out.println("Ingresa un valor correcto");
                }
            }else if(respuesta==2){
                //Elabora una lista con los jugadores para poder mostrarla
                for(int i=0;i<jugadores.size();i++){
                    System.out.println("##################################################3");
                    System.out.println(jugadores.get(i).toString());
                    System.out.println("##################################################3");
                }
            }
            else if(respuesta==3){
                //Elabora una lista con las efectividades de los liberos y solamente evalua el mayor, para obtener el mejor libero del torneo. 
                int cantidadLiberos;
                ArrayList <Double> topLiberos=new ArrayList<Double>();
                

                for(int i=0;i<jugadores.size();i++){
                    int index=0;
                    if(jugadores.get(i).getTipo().equalsIgnoreCase("libero")){
                        index=i;
                        //topLiberos.add(jugadores.get(i).getEfectividad());
                        
                    }
                }
                String nombre="";
                for(int i=0;i<liberos.size();i++){
                    if(liberos.get(i).getEfectividad()==Collections.max(topLiberos)){
                        nombre=liberos.get(i).getNombre();
                    }
                }
                System.out.println("##################################################3");
                System.out.println("El mejor libero es: "+nombre+", con efectividad de: "+Collections.max(topLiberos));
                System.out.println("##################################################3");
                

            }
            else if(respuesta==4){
                //Elabora una lista y solamente ingresa a la misma los jugadores que tengan un porcetaje de efectividad del 80%.
                ArrayList <Double> topPasadores=new ArrayList<Double>();
                for(int i=0;i<pasadores.size();i++){
                    if(pasadores.get(i).getEfectividad()>80.00){
                        topPasadores.add(pasadores.get(i).getEfectividad());
                    }
                }
                System.out.println("##################################################3");
                
                System.out.println("Cantidad de pasadores con efectivad mayor al 80%-->"+topPasadores.size());
                System.out.println("##################################################3");
            }
            else if(respuesta==5){
                System.out.println("Feliz dia");
            }else{
                System.out.println("Ingresa un valor correcto");
            }
            System.out.println("#####################################################");
        }



    }
}