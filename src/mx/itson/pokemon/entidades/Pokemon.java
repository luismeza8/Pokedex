/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pokemon.entidades;

import java.util.List;
import mx.itson.pokemon.enumeradores.Tipo;

/**
 *
 * @author lm
 */
public class Pokemon {
    
    private String nombre;
    private List<Tipo> tipos;
    private List<Ataque> ataques;
    private int nivel;
    private String entrada;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipos
     */
    public List<Tipo> getTipos() {
        return tipos;
    }

    /**
     * @param tipos the tipos to set
     */
    public void setTipos(List<Tipo> tipos) {
        this.tipos = tipos;
    }

    /**
     * @return the ataques
     */
    public List<Ataque> getAtaques() {
        return ataques;
    }

    /**
     * @param ataques the ataques to set
     */
    public void setAtaques(List<Ataque> ataques) {
        this.ataques = ataques;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the entrada
     */
    public String getEntrada() {
        return entrada;
    }

    /**
     * @param entrada the entrada to set
     */
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }
    
    
}
