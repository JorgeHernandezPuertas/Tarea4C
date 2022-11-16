/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author jorge
 */
public class Persona {

    // Atributos de instancia
    private String nombre;
    private int edad;
    private String sexo; // Solo puede ser "M", "H", "O"
    private float peso; // Peso en kilos
    private int altura; // Altura en centimetros
    private String NIF; // String de 9 elementos que contiene 8 numeros y 1 letra

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, float peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = (filtrarSexo(sexo)) ? sexo : "O"; // Si pasa el filtro se pone la letra que sea y si no se pone "O"
        this.peso = peso;
        this.altura = altura;
        this.NIF = generarNIF();
    }

    // Método para filtrar el sexo de cada persona creada (Si es 'M', 'H' o 'O' da true, en caso contrario false)
    private boolean filtrarSexo(String sexo) {
        String sexoString = sexo;
        return (sexoString.equals("M") || sexoString.equals("H") || sexoString.equals("O"));
    }

    // Método para generar un NIF aleatorio a cada persona creada
    private String generarNIF() {
        String NIF = "";
        int numNIF = Integer.parseInt(RandomStringUtils.randomNumeric(8));
        switch (numNIF % 23) {
            case 0 -> {
                NIF = numNIF + "T";
            }
            case 1 -> {
                NIF = numNIF + "R";
            }
            case 2 -> {
                NIF = numNIF + "W";
            }
            case 3 -> {
                NIF = numNIF + "A";
            }
            case 4 -> {
                NIF = numNIF + "G";
            }
            case 5 -> {
                NIF = numNIF + "M";
            }
            case 6 -> {
                NIF = numNIF + "Y";
            }
            case 7 -> {
                NIF = numNIF + "F";
            }
            case 8 -> {
                NIF = numNIF + "P";
            }
            case 9 -> {
                NIF = numNIF + "D";
            }
            case 10 -> {
                NIF = numNIF + "X";
            }
            case 11 -> {
                NIF = numNIF + "B";
            }
            case 12 -> {
                NIF = numNIF + "N";
            }
            case 13 -> {
                NIF = numNIF + "J";
            }
            case 14 -> {
                NIF = numNIF + "Z";
            }
            case 15 -> {
                NIF = numNIF + "S";
            }
            case 16 -> {
                NIF = numNIF + "Q";
            }
            case 17 -> {
                NIF = numNIF + "V";
            }
            case 18 -> {
                NIF = numNIF + "H";
            }
            case 19 -> {
                NIF = numNIF + "L";
            }
            case 20 -> {
                NIF = numNIF + "C";
            }
            case 21 -> {
                NIF = numNIF + "K";
            }
            case 22 -> {
                NIF = numNIF + "E";
            }
        }
        return NIF;
    }

    // Método para ver si la persona es mayor de edad o no ( >=18 )
    public boolean esMayorEdad() {
        return (this.edad >= 18);
    }
    
    // Método para calcular el IMC de la persona
    public float calcularIMC() {
        return this.peso/(float)Math.pow(this.altura/100.0,2); // Fórmula del IMC divido altura entre 100 para pasar a metros
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    public String getNIF() {
        return NIF;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    // Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", sexo=").append(sexo);
        sb.append(", peso=").append(peso);
        sb.append(", altura=").append(altura);
        sb.append(", NIF=").append(NIF);
        sb.append('}');
        return sb.toString();
    }
    
    // Método de dar like a una serie
    public void darLikeSerie(Serie serie) {
        serie.darLike(); // Da like a la serie pasada
    }
    
    
}
