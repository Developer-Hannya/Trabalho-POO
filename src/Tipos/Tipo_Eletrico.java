/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tipos;

import Main.Pokemon;

/**
 *
 * @author berna
 */
public abstract class Tipo_Eletrico extends Pokemon {
    public Tipo_Eletrico() {
        this.tipo = "Eletrico";
        this.tipoFraqueza = "Terra";
        this.tipoVantagem = "Agua";
    }
    
}
