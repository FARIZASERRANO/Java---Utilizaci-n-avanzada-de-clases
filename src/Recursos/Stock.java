/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

import actividad06.*;

/**
 *
 * @author Fernando.Ariza
 */
public class Stock {
    
    public static Vehiculo[] obtenerStockVehiculos(){
    
        
      Vehiculo toyota = new Coche("M-1462-WW","Celica", 4, 4, 50.00, "A");
      Vehiculo CRV = new Coche("BWH 2563" , "CRV", 5, 10, 75, "B");
      Vehiculo man750 = new Camion("KLS 25000", "Iveco Cargo", 3, 2, 0, 0, "a");
      Vehiculo Gondola = new Carga("FGH 1234", "Remolque", 0, 2, 600.00, 25.00);
      
      Vehiculo[] stockVehiculos = new Vehiculo[100];
      
      stockVehiculos[0] = toyota;
      stockVehiculos[1] = CRV;
      stockVehiculos[2] = man750;
      stockVehiculos[3] = Gondola;
    
      
     
    
      return stockVehiculos;
    }
    
}
