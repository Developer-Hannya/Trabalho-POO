/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDePokemons;

import Tipos.Tipo_Terra;
import javax.swing.ImageIcon;

/**
 *
 * @author berna
 */
public class Sandshrew extends Tipo_Terra {
    public Sandshrew() {
        this.nome = "Sandshrew";
        this.vida = 1000;
        this.ataque = 100;
        try {
            //URL imagemURL;
            //imagemURL = ("SptritesESelectScreen/pikachu - left.png");
            //imagemURL = Pikachu.class.getClassLoader().getResource("/SptritesESelectScreen/pikachu - left.png");
            this.imagem = new ImageIcon("src/SpritesESelectScreen/sandshrew - left.png");
        } catch(Exception e) {
            
        }        
    }
}
