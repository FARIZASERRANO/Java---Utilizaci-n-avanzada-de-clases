/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

import java.util.Scanner;

/**
 *
 * @author Fernando.Ariza
 */
public class Pregunta {
    
    public static int pideEntero(String pregunta){
        
    int valorEntero = 0;

    boolean devuelveValor = false;

        do {

            try {

                             
                System.out.println(pregunta);

                Scanner myObj = new Scanner(System.in);

                valorEntero = Integer.parseInt(myObj.nextLine());

                devuelveValor = true;

            } catch (NumberFormatException a) {

                System.out.println("El valor introducido, no es valido.");

            }

        } while (!devuelveValor);

        return valorEntero;

    }
    
    

    /**
    * @Desc: Solicita al usuario que introduzca un valor Double. La funcion controla que el valor es correcto o devuelve un error. 
    * @param : La funcion recibe un String con el texo que se mostrarÃ¡ al usuaio
    * @return: La funcion devulve un valor Double, una vez comprobado que el valor es correcto.
    */
    public static double pideDouble(String pregunta) {

    Double valorDouble = 0.000000;

    boolean devuelveValor = false;

    System.out.println(pregunta);

    Scanner myObj = new Scanner(System.in);

    do {

        try {

            valorDouble = Double.parseDouble(myObj.nextLine());

            devuelveValor = true;

        } catch (NumberFormatException a) {

            System.out.println("El valor introducido, no es valido. Introduzca un numero con formato '0.0000...'");
        }

    } while (!devuelveValor);

    return valorDouble;

    }

    public static String pideTexto(String pregunta){
   
        String valor = null;
        
        System.out.println(pregunta);
        
        do{
        
           Scanner MyObj = new Scanner(System.in);
           valor = MyObj.nextLine();
                             
           if (valor.equals("")){
           
               System.out.println("El valor no puede quedar vacio. Introduzca un valor nuevo.");
                                    
           } else if(!valor.matches(".*[a-z A-Z 0-9.].*")){
        
               System.out.println("El nombre del fichero solo puede contener letras o numeros. Introduzca un nuevo nombre");
               valor = "";         
           }  
  
        
        } while(valor.equals(""));
         
           
     return valor;
     }
    
}
