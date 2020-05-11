/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad06;

import Recursos.Pregunta;
import Recursos.Utilidades;
import Recursos.Stock;
import java.io.IOException;
        
/**
 *
 * @author Fernando.Ariza
 */
public class Actividad06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        Vehiculo listaDeVehiculos[];
        
        listaDeVehiculos = Recursos.Stock.obtenerStockVehiculos();
    
        int proximoHuecoEnaListaDeVehiculos = 4;
        
        int valorMenu;

        
        Utilidades.limpiaPantalla();

        do {
           
            Vehiculo vehiculoAConsultar = null;
            
            Utilidades.limpiaPantalla();
            
            Utilidades.imprimeCabecera();

            Utilidades.imprimeMenu();

            valorMenu = Pregunta.pideEntero("Seleccione una opcion:");

            switch (valorMenu) {

                case 1:
                    
                    Utilidades.limpiaPantalla();
                    
                    listaDeVehiculos[proximoHuecoEnaListaDeVehiculos]  = new Coche();
                    
                    listaDeVehiculos[proximoHuecoEnaListaDeVehiculos].pideDatos();
                    
                    proximoHuecoEnaListaDeVehiculos ++;


                    break;
                
                
                case 2:
                    
                    Utilidades.limpiaPantalla();
                                        
                    listaDeVehiculos[proximoHuecoEnaListaDeVehiculos]  = new Carga();
                    
                    listaDeVehiculos[proximoHuecoEnaListaDeVehiculos].pideDatos();
                    
                    proximoHuecoEnaListaDeVehiculos ++;

                    break;
                
                                
                case 3:
                    
                    Utilidades.limpiaPantalla();
                    
                    listaDeVehiculos[proximoHuecoEnaListaDeVehiculos]  = new Camion();
                    
                    listaDeVehiculos[proximoHuecoEnaListaDeVehiculos].pideDatos();
                    
                    proximoHuecoEnaListaDeVehiculos ++;
                    
                    break;
                    
                    
                case 4:
                    
                    Utilidades.limpiaPantalla();
                                         
                    vehiculoAConsultar = Utilidades.mostrarMatriculasDeLaFlota(listaDeVehiculos, proximoHuecoEnaListaDeVehiculos);
                                      
                    Utilidades.limpiaPantalla();
                    
                    vehiculoAConsultar.mostrarInformacion();
                    
                    Utilidades.pausa();
                    
                    break;
                    
                    
                case 5:
                    
                    Utilidades.limpiaPantalla();          
                    
                    vehiculoAConsultar = Utilidades.mostrarMatriculasDeLaFlota(listaDeVehiculos, proximoHuecoEnaListaDeVehiculos);
                    
                    vehiculoAConsultar.setNumeroDeDiasAlquilado(Pregunta.pideEntero("Introduce el nuevo numero de dias de alquiler: "));
              
                    vehiculoAConsultar.getPrecioTotalAlquilerPorDias();
                    
                    Utilidades.pausa();
                    
                    break;
                    
                    
                case 6:
              
                    Utilidades.limpiaPantalla();
                    
                    Utilidades.mostrarTodoLosCochesDeLaFlota(listaDeVehiculos, proximoHuecoEnaListaDeVehiculos);
                    
                    Utilidades.pausa();
                            
                                        
                    break;

            }

        }while(7 != valorMenu);
        
        
        
        
        
    }
    
}
