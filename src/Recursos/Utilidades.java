/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

import actividad06.Camion;
import actividad06.Carga;
import actividad06.Coche;
import actividad06.Vehiculo;
import java.io.IOException;


/**
 *
 * @author Fernando.Ariza
 */
public class Utilidades {
    
      public static void imprimeCabecera(){

        System.out.println("***************************************");
        System.out.println("**** SISTEMA DE GESTION DE VEHICULOS ****");
        System.out.println("***************************************");
        
    }
    
    
    public static void imprimeMenu(){

        System.out.println("");
        System.out.println("**** OPCIONES DE AÑADIR ******");
        System.out.println("");
        System.out.println("");
        System.out.println("1.- Añadir un coche nuevo");
        System.out.println("2.- Añadir un camion nuevo");
        System.out.println("3.- Añadir una carga nueva");
        System.out.println("");
        System.out.println("");
        System.out.println("**** OPCIONES DE CONSULTA ****");
        System.out.println("");
        System.out.println("");
        System.out.println("4.- Modificar informacion de un vehiculo");
        System.out.println("5.- Modificar los dia de alquiler de un vehiculo");
        System.out.println("6.- Modificacion masiva de parametros para la flota");
        System.out.println("");
        System.out.println("******************************");
        System.out.println("7.- Salir");

    }
    
    
    public static void limpiaPantalla(){
    
        for (int i = 0; i < 100; i++) {
            System.out.println("");
        }
    
    }
    

    public static void pausa() throws IOException {

        System.out.println("Presione intro para volver al menu...");

        System.in.read();

        // TO - DO : CONSEGUIR QUE PIERDA EL INTRO QUE SE PULSA PARA CONTINUAR.
       
    }
    
    
 

    public static Vehiculo mostrarMatriculasDeLaFlota(Vehiculo[] listaDeVehiculos, Integer proximoHuecoEnaListaDeVehiculos){
    
        Vehiculo vehiculoAConsultar;
        Integer vehiculoelegido;
  
        
        for(int i = 0; i < proximoHuecoEnaListaDeVehiculos; i++){
            
            System.out.println((i + 1) + ".- " + listaDeVehiculos[i].getMatricula());
        }
        
        vehiculoelegido = Pregunta.pideEntero("Introduce numero del vehiculo a consultar: ");
        
        vehiculoelegido --;
        
        vehiculoAConsultar = listaDeVehiculos[vehiculoelegido];
        
        return vehiculoAConsultar;
        
    }
        
        
    public static void mostrarTodoLosCochesDeLaFlota(Vehiculo[] listaDeVehiculos, Integer proximoHuecoEnaListaDeVehiculos){
    
    
        for(int i = 0; i < proximoHuecoEnaListaDeVehiculos; i++){
            
            System.out.println("");  
            System.out.println("*********************************************");
            System.out.println("");  
            listaDeVehiculos[i].mostrarInformacion();
            System.out.println("");  
            System.out.println("*********************************************");
        }
    
    }
    
}
    
    


