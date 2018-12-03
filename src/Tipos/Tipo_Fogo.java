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
public abstract class Tipo_Fogo extends Pokemon {
    public Tipo_Fogo() {
        this.tipo = "Fogo";
        this.tipoFraqueza = "Agua";
        this.tipoVantagem = "Terra";
    }
}
