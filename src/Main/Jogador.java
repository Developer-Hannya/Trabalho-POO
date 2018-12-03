/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.Serializable;

/**
 *
 * @author berna
 */
public class Jogador implements Serializable{
    protected Pokemon pokemon;
    protected String apelido;
    protected Jogador oponente;
    // private boolean perdeu = false;
   private int jogada;

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    
    public void setJogada(int jogada)
    {
        this.jogada= jogada;
    }
    public int getJogada() 
    {
        return this.jogada;
    }
        
    
}
