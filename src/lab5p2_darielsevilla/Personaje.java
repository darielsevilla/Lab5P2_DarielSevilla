/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5p2_darielsevilla;

/**
 *
 * @author HP
 */
public class Personaje {
    private String nombre;
    private int agilidadFisica;
    private String poder;
    private String debilidad;
    private String universo;
    private int agilidadMental;
    private int fuerza;
    private int hp;

    public Personaje() {
    }

    public Personaje(String nombre, int agilidadFisica, String poder, String debilidad, String universo, int agilidadMental, int fuerza, int hp) {
        this.nombre = nombre;
        this.agilidadFisica = agilidadFisica;
        this.poder = poder;
        this.debilidad = debilidad;
        this.universo = universo;
        this.agilidadMental = agilidadMental;
        this.fuerza = fuerza;
        this.hp = hp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAgilidadFisica() {
        return agilidadFisica;
    }

    public void setAgilidadFisica(int agilidadFisica) {
        this.agilidadFisica = agilidadFisica;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public int getAgilidadMental() {
        return agilidadMental;
    }

    public void setAgilidadMental(int agilidadMental) {
        this.agilidadMental = agilidadMental;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "<html>nombre:" + nombre + "<br>   hp: " + hp + "<br>   A. fisica: " + agilidadFisica + " A. mental: "+ agilidadMental+ "<br>   poder: " + poder + " debilidad: " + debilidad +"<br>   universo: " + universo + "</html>";
    }
    
    
    
}
