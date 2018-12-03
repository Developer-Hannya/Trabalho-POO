/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDePokemons;

import Tipos.Tipo_Agua;
import javax.swing.ImageIcon;

/**
 *
 * @author berna
 */
public class Squirtle extends Tipo_Agua{
    public Squirtle() { 
        this.nome = "Squirtle";
        this.vida = 1000;
        this.ataque = 100;
        try {
            //URL imagemURL;
            //imagemURL = ("SptritesESelectScreen/pikachu - left.png");
            //imagemURL = Pikachu.class.getClassLoader().getResource("/SptritesESelectScreen/pikachu - left.png");
            this.imagem = new ImageIcon("src/SpritesESelectScreen/squirtle - left.png");
        } catch(Exception e) {
            
        }        
    }
}
