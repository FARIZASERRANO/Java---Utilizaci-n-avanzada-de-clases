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
public abstract class Vehiculo implements IVehiculo {

    protected String matricula;
    protected String modelo; 
    protected Integer numeroDePlazas;
    protected Integer numeroDeDiasAlquilado;
    protected double precio;


    
    public Vehiculo(){}
    
    public Vehiculo(String matricula, String modelo, Integer numeroDePlazas, Integer numeroDeDiasAlquilado, double precio) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.numeroDePlazas = numeroDePlazas;
        this.numeroDeDiasAlquilado = numeroDeDiasAlquilado;
        this.precio = precio;
          
        
    }

    
    
    @Override
    public double getPrecioTotalAlquilerPorDias(){
    
        double precioVehiculoPorDias = getNumeroDeDiasAlquilado() * getPrecio();
        
    return precioVehiculoPorDias;
    
    }
    
    @Override
    public void mostrarInformacion(){
        
        System.out.println("INFORME SOBRE EL VEHICULO CON MATRICULA: " + getMatricula());
        System.out.println("Modelo del Vehiculo: " + getModelo());
        System.out.println("Numero de plazas del Vehiculo: " + getNumeroDePlazas());
        System.out.println("Dias en alquiler del Vehiculo: " + getNumeroDeDiasAlquilado());
        System.out.println("Precio por dia de alquiler: " + getPrecio());
        
    }
    
    
    @Override
    public void pideDatos(){
        
    setMatricula(Pregunta.pideTexto("Introduce la matricula: "));
    setModelo(Pregunta.pideTexto("Introduce el modelo: "));
    setNumeroDePlazas(Pregunta.pideEntero("Introduce numero de plazas: "));
    setNumeroDeDiasAlquilado(Pregunta.pideEntero("Introduce numero de dias Alquilado: "));
    setPrecio(Pregunta.pideDouble("Introduce el precio: "));
        
    }

/////////// FUNCIONES PROPIAS DE LA CLASE VEHICULO /////////////   
    
    
    
    

/////////// GETTERS /////////////
    
    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }
    
    public Integer getNumeroDePlazas() {
        return numeroDePlazas;
    }
    
    public Integer getNumeroDeDiasAlquilado() {
        return numeroDeDiasAlquilado;
    }

    public double getPrecio() {
        return precio;
    }
    
    
    

    /////////// SETTERS /////////////

    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public void setNumeroDePlazas(Integer numeroDePlazas) {
        this.numeroDePlazas = numeroDePlazas;
    }


    public void setNumeroDeDiasAlquilado(Integer numeroDeDiasAlquilado) {
        this.numeroDeDiasAlquilado = numeroDeDiasAlquilado;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }
     
     

    
    
    
    
    
    
}
