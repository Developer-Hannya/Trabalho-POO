/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDePokemons;

import Tipos.Tipo_Eletrico;
import javax.swing.ImageIcon;

/**
 *
 * @author berna
 */
public class Pikachu extends Tipo_Eletrico {
    
    public Pikachu() {
        this.nome = "Pikachu";
        this.vida = 1000;
        this.ataque = 100;
        try {
            //URL imagemURL;
            //imagemURL = ("SpritesESelectScreen/pikachu - left.png");
            //imagemURL = Pikachu.class.getClassLoader().getResource("/SpritesESelectScreen/pikachu - left.png");
            this.imagem = new ImageIcon("src/SpritesESelectScreen/pikachu - left.png");
        } catch(Exception e) {
            
        }
        
    }
    
}
