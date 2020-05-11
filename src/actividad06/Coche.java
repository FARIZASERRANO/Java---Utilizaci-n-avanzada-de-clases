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
public class Coche extends Vehiculo {
    private String gama;
    
/////////// CONSTRUCTOR DE LA CLASE VEHICULO /////////////    
    
    
    public Coche(){}
    
    public Coche(String matricula, String modelo, Integer numeroDePlazas, Integer numeroDeDiasAlquilado, double precio, String gama) {
        super(matricula, modelo, numeroDePlazas, numeroDeDiasAlquilado, precio);
        this.gama = gama;
    }
    


/////////// FUNCIONES PROPIAS DE LA CLASE VEHICULO /////////////    
    

    public void getPrecioTotalAlquilerPorDias(double precioVehiculoPorDias){
        
        double incrementoPorSerCoche = 1.5;
    
        double suplementoPorSerCoche = ((getNumeroDeDiasAlquilado() * incrementoPorSerCoche) + (getNumeroDePlazas() * incrementoPorSerCoche));
                
        System.out.println("El precio total de alquiler por dias es : " + (suplementoPorSerCoche + precioVehiculoPorDias));
    
    }
    
    @Override
    public void mostrarInformacion(){
        
        super.mostrarInformacion();
        System.out.println("Gama del vehiculo: " + getGama());

        this.getPrecioTotalAlquilerPorDias(super.getPrecioTotalAlquilerPorDias());
                       
    }
    
    
    @Override
    public void pideDatos(){
        
        super.pideDatos();
        setGama(Pregunta.pideTexto("Introduce la gama (A,B,C,D,E....): "));
                    
    }
    

/////////// GETTERS DE LA CLASE COCHE /////////////
    
    public String getGama(){
        return gama;
    }



/////////// SETTERS DE LA CLASE COCHE /////////////

    public void setGama(String gama){
        this.gama = gama;
    }





}
