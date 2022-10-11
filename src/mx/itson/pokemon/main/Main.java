/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pokemon.main;

import java.util.ArrayList;
import java.util.List;
import mx.itson.pokemon.entidades.Ataque;
import mx.itson.pokemon.entidades.Pokemon;
import mx.itson.pokemon.enumeradores.Tipo;

/**
 *
 * @author lm
 */
public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        Ataque ataque1 = new Ataque();
        Ataque ataque2 = new Ataque();
        
        List<Ataque> ataques = new ArrayList();
        List<Tipo> tipos = new ArrayList();
        
        ataque1.setNombre("Arañazo");
        ataque1.setTipo(Tipo.NORMAL);
        ataques.add(ataque1);
        
        ataque2.setNombre("Ascuas");
        ataque2.setTipo(Tipo.FUEGO);
        ataques.add(ataque2);
        
        tipos.add(Tipo.FUEGO);
        
        pokemon.setNombre("Litten");
        pokemon.setEntrada("Detesta que lo acaricien demasiado, aunque lo hagan sus seres queridos. En caso de sentirse agobiado se recluye en sí mismo.");
        pokemon.setNivel(5);
        pokemon.setAtaques(ataques);
        pokemon.setTipos(tipos);
        
        System.out.println("*** POKEDEX ***");
        
        System.out.println(pokemon.getNombre());
        System.out.println(pokemon.getEntrada() + "\n");
        
        for (Tipo t : pokemon.getTipos()){
            System.out.print("Tipo: " + t.toString());
        }
        
        System.out.println("\nNivel: " + pokemon.getNivel());
        
        System.out.println("Ataques: ");
        
        for (Ataque a : pokemon.getAtaques()){
            System.out.println("- " + a.getNombre() + " - " + a.getTipo().toString());
        }
        
        
    }
}
