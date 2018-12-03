/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tipos;

import Main.Pokemon;

/**
 *
 * @author B. Yoshi from Hannya Productions
 */
public abstract class Tipo_Agua extends Pokemon {
    
    public Tipo_Agua() {
        this.tipo = "Agua";
        this.tipoFraqueza = "Eletrico";
        this.tipoVantagem = "Fogo";
    }
     
        
}
