/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author jorge
 */
// Declaración de la clase
public class Serie {
    
    // Atributos de instancia (no static)
    private String titulo;
    private String genero;
    private String sinopsis;
    private String  productora;
    private int numTemporadas;
    private int numLikes;

    // Constructores
    public Serie(String titulo, String genero, String sinopsis, String productora, int numTemporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.productora = productora;
        this.numTemporadas = numTemporadas;
    }

    public Serie() {
        /*
        Los atributos quedan inicializados con los valores por defecto:
        objetos a null, boolean a false y numeros a 0
        */
    }
    
    public Serie(String titulo, String genero, String sinopsis, String productora, int numTemporadas, int numLikes) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.productora = productora;
        this.numTemporadas = numTemporadas;
        this.numLikes = numLikes;
    }
    
    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getProductora() {
        return productora;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    // Método toString sobreescrito
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Serie{");
        sb.append("titulo=").append(titulo);
        sb.append(", genero=").append(genero);
        sb.append(", sinopsis=").append(sinopsis);
        sb.append(", productora=").append(productora);
        sb.append(", numTemporadas=").append(numTemporadas);
        sb.append(", numLikes=").append(numLikes);
        sb.append('}');
        return sb.toString();
    }
    
    // Método propio de la clase Serie dar like
    public void darLike(){
        this.numLikes++;
    }
    
}

