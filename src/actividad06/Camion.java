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
public class Camion extends Carga {
    
    private String tipoDeEstructura;
    
    
/////////// CONSTRUCTOR DE LA CLASE VEHICULO /////////////  
    
    public Camion(){}
    
    
    public Camion(String matricula, String modelo, Integer numeroDePlazas, Integer numeroDeDiasAlquilado, double precio, double PMA, String tipoDeEstructura){
        super(matricula, modelo, numeroDePlazas, numeroDeDiasAlquilado, 0, 0);
        this.tipoDeEstructura = tipoDeEstructura;
        
    }
    
/////////// FUNCIONES PROPIAS DE LA CLASE CAMION /////////////    
     
    @Override
    public void getPrecioTotalAlquilerPorDias(double precioVehiculoPorDias){
        
        double incrementoPorSerCamion = 20;
        
        double incrementoFijoPorSecamion = 40;
    
        double suplementoPorSerCarga = ((getPMA() * incrementoPorSerCamion) + incrementoFijoPorSecamion);
                
        System.out.println("El precio total de alquiler por dias es : " + (suplementoPorSerCarga + precioVehiculoPorDias));
    
    }
    
    @Override
    public void mostrarInformacion(){
        
        super.mostrarInformacion();
        System.out.println("Tipo de estructura: " + getTipoDeEstructura());
        
        this.getPrecioTotalAlquilerPorDias(super.getPrecioTotalAlquilerPorDias());
                       
    }
    
    
    
    
    @Override
    public void pideDatos(){
        
    super.pideDatos();
    setTipoDeEstructura(Pregunta.pideTexto("Introduce el tipo de estructura: "));
                    
    }
    
/////////// GETTERS DE LA CLASE COCHE /////////////
    
    public String getTipoDeEstructura(){
        return tipoDeEstructura;
    }
    
    
    
/////////// SETTERS DE LA CLASE COCHE /////////////
    
    
    public void setTipoDeEstructura(String tipoDeEstructura){
        this.tipoDeEstructura = tipoDeEstructura;
    }
    
    
}
