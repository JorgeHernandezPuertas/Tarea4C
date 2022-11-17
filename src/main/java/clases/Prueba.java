/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author jorge
 */
public class Prueba {
    public static void main(String[] args) {
        // Creo persona con el método de la clase ServicioPersona
        Persona kosio = ServicioPersona.nuevaPersonaTeclado();
        // Muestro a la persona creada
        System.out.println(kosio);
        System.out.println("------------------------------------");
        // Creo persona con el constructor sin parámetros
        Persona personaVacia = new Persona();
        // Muestro la persona creada
        System.out.println(personaVacia);
        System.out.println("------------------------------------");
        // Muestro si son mayores de edad
        System.out.println("¿Es kosio mayor de edad?" + kosio.esMayorEdad());
        System.out.println("¿Es persona vacía mayor de edad?" + personaVacia.esMayorEdad());
        // Calculo el IMC de ambos y digo si tienen peso normal, inferior o superior
        // el rango de peso normal es (18,5-24,9)
        String tipoPesoKosio = "";
        String tipoPesoVacia = "";
        float imcKosio = kosio.calcularIMC();
        float imcVacia = personaVacia.calcularIMC();
        if (imcKosio< 18.5){
            tipoPesoKosio = "inferior al normal";
        } else if (imcKosio <= 24.9) {
            tipoPesoKosio = "normal";
        }else if (imcKosio > 24.9) {
            tipoPesoKosio = "superior al normal";
        }
        if (imcVacia< 18.5){
            tipoPesoVacia = "inferior al normal";
        } else if (imcVacia <= 24.9) {
            tipoPesoVacia = "normal";
        }else if (imcVacia > 24.9) {
            tipoPesoVacia = "superior al normal";
        }
        System.out.println("El IMC de kosio es " + kosio.calcularIMC() + 
                " por lo que su peso es " + tipoPesoKosio);
        System.out.println("El IMC de persona vacía es " + personaVacia.calcularIMC()
                + " por lo que su peso es " + tipoPesoVacia);
        // Creo un objeto tipo Serie
        Serie house = new Serie("House", "Medicina/Drama", 
                "Un doctor siempre tiene razón", "BBC", 8, 9999);
        // Enseño los datos de la serie para comparar luego
        System.out.println(house);
        // Hago que kosio le de "me gusta" a "house"
        kosio.darLikeSerie(house);
        // Vuelvo a enseñar los datos de "house" para ver si le ha dado like
        System.out.println(house);
        
    }
}
