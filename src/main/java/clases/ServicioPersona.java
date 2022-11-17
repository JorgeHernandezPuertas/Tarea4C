/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class ServicioPersona {

    // Creo un objeto scanner para la clase
    private static Scanner teclado = new Scanner(System.in);

    // Método para pedir los datos de la persona por teclado y crearla
    public static Persona nuevaPersonaTeclado() {
        Persona nuevaPersona;
        // Pido los datos
        String nombre = pedirNombreTeclado();
        int edad = pedirEdad();
        char sexo = pedirSexo();
        float peso = pedirPeso();
        int altura = pedirAltura();
        // Creo la persona
        nuevaPersona = new Persona(nombre, edad, sexo, peso, altura);
        return nuevaPersona;
    }

    // Método para pedir nombre
    private static String pedirNombreTeclado() {
        String nombre = "";
        System.out.println("Introduce el nombre de la persona: ");
        nombre = teclado.nextLine();
        System.out.println("------------------------------------------");
        return nombre;
    }

    // Método pedir edad
    private static int pedirEdad() {
        int edad = -1;
        do {
            try {
                System.out.println("Introduce la edad de la persona: ");
                edad = teclado.nextInt();
                System.out.println("------------------------------------------");
                if (edad < 0) {
                    System.out.println("Introduce un edad válida, ninguna persona "
                            + "tiene menos de 0 años.");
                    System.out.println("------------------------------------------");
                }
            } catch (InputMismatchException ime) {
                System.out.println("------------------------------------------");
                System.out.println("Introduce un entero por favor.");
                System.out.println("------------------------------------------");
            }
            teclado.nextLine(); // Limpio el buffer
        } while (edad < 0);
        return edad;
    }

    // Método para pedir el sexo
    private static char pedirSexo() {
        char sexo = 'O';
        System.out.println("Introduce el sexo de la persona ('H', 'M' o 'O'): ");
        sexo = teclado.nextLine().charAt(0);
        System.out.println("------------------------------------------");
        return sexo;
    }

    // Método para pedir peso
    private static float pedirPeso() {
        float peso = -1;
        do {
            try {
                System.out.println("Introduce el peso de la persona en KGs: ");
                peso = teclado.nextFloat();
                System.out.println("------------------------------------------");
                if (peso < 0) {
                    System.out.println("Una persona no puede tener peso negativo");
                    System.out.println("------------------------------------------");
                }
            } catch (InputMismatchException ime) {
                System.out.println("------------------------------------------");
                System.out.println("Introduce un décimal por favor");
                System.out.println("------------------------------------------");
            }
            teclado.nextLine(); // Limpio el buffer
        } while (peso < 0);
        return peso;
    }

    // Método para pedir altura
    private static int pedirAltura() {
        int altura = -1;
        do {
            try {
                System.out.println("Introduce la altura de persona en cms: ");
                altura = teclado.nextInt();
                System.out.println("------------------------------------------");
                if (altura < 0) {
                System.out.println("No hay personas con altura negativa.");
                System.out.println("------------------------------------------");
            }
            } catch (InputMismatchException ime) {
                System.out.println("------------------------------------------");
                System.out.println("La altura tiene que ser un entero.");
                System.out.println("------------------------------------------");
            }
            teclado.nextLine(); // Limpio buffer
        } while (altura < 0);
        return altura;
    }
}
