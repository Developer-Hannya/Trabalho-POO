/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDePokemons;

import Tipos.Tipo_Fogo;
import javax.swing.ImageIcon;

/**
 *
 * @author berna
 */
public class Charmander extends Tipo_Fogo {
    public Charmander() { 
        this.nome = "Charmander";
        this.vida = 1000;
        this.ataque = 100;
        try {
            //URL imagemURL;
            //imagemURL = ("SptritesESelectScreen/pikachu - left.png");
            //imagemURL = Pikachu.class.getClassLoader().getResource("/SptritesESelectScreen/pikachu - left.png");
            this.imagem = new ImageIcon("src/SpritesESelectScreen/charmander - left.png");
        } catch(Exception e) {
            
        }        
    }
}
