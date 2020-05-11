/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad06;

import Recursos.Pregunta;

/**
 *
 * @author Fernando.Ariza
 */
public class Carga extends Vehiculo {
    private double PMA = 0.00;
    
    public Carga(){}
    
    public Carga(String matricula, String modelo, Integer numeroDePlazas, Integer numeroDeDiasAlquilado, double precio, double PMA){
        super(matricula, modelo, numeroDePlazas, numeroDeDiasAlquilado, precio);
        this.PMA = PMA;
    
    }
    
    public void getPrecioTotalAlquilerPorDias(double precioVehiculoPorDias){
        
        double incrementoPorSerCarga = 20;
    
        double suplementoPorSerCarga = getPMA() * incrementoPorSerCarga;
                
        System.out.println("El precio total de alquiler por dias es : " + (suplementoPorSerCarga + precioVehiculoPorDias));
    
    }
    
    @Override
    public void mostrarInformacion(){
        
        super.mostrarInformacion();
        System.out.println("Peso Maximo Autorizado: " + getPMA());

        this.getPrecioTotalAlquilerPorDias(super.getPrecioTotalAlquilerPorDias());
                       
    }
    
    
    @Override
    public void pideDatos(){
    
    super.pideDatos();
    setPMA(Pregunta.pideDouble("Introduce el PMA: "));

    }
    

    
/////////// FUNCIONES PROPIAS DE LA CLASE CARGA /////////////    
    
    
    
/////////// GETTERS /////////////
    
    public double getPMA(){
        return PMA;
    }
    
/////////// SETTERS /////////////
    
    public void setPMA(Double PMA){
        this.PMA = PMA;
    }
    
    
}
