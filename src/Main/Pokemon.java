/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.Serializable;
import javax.swing.ImageIcon;


/**
 *
 * @author berna
 */
public abstract class Pokemon implements Serializable {
    protected String nome;
    // nome será também o tipo do Pokemon, ex: Pikachu
    
    protected String tipo;
    // o tipo (único) que está relacionado a esse Pokémon
    
    protected double vida;
    // pontos que precisam ser alcançados até chegar no nocaute, ex: 100
    
    protected double ataque;
    // pontos que arracam vida do oponente
           
    protected String tipoVantagem;
    // o tipo de pokemon que recebe mais dano
    
    protected String tipoFraqueza;
    // o tipo de pokemon que causa mais dano    
    
    protected ImageIcon imagem;
    //O sprite do Pokemon

    public ImageIcon getImagem() {
        return imagem;
    }

    public void setImagem(ImageIcon imagem) {
        this.imagem = imagem;
    }
    
    public Pokemon() {
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }
    
    public String getTipoVantagem() {
        return tipoVantagem;
    }

    public void setTipoVantagem(String tipoVantagem) {
        this.tipoVantagem = tipoVantagem;
    }

    public String getTipoFraqueza() {
        return tipoFraqueza;
    }

    public void setTipoFraqueza(String tipoFraqueza) {
        this.tipoFraqueza = tipoFraqueza;
    }    
    
}
