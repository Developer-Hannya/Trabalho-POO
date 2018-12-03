/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDePokemons;

import Tipos.Tipo_Grama;
import javax.swing.ImageIcon;

/**
 *
 * @author berna
 */
public class Bulbassauro extends Tipo_Grama {
    public Bulbassauro() {
        this.nome = "Bulbassauro";
        this.vida = 1000;
        this.ataque = 100;
        
        try {
            //URL imagemURL;
            //imagemURL = ("SptritesESelectScreen/pikachu - left.png");
            //imagemURL = Pikachu.class.getClassLoader().getResource("/SptritesESelectScreen/pikachu - left.png");
            super.imagem = new ImageIcon("src/SpritesESelectScreen/bulbassaur - left.png");
        } catch(Exception e) {
            
        }
        
    }
    
   
}
