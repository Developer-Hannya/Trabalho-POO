/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tipos;

import Main.Pokemon;

/**
 *
 * @author Developer B. Yoshi from Hannya Productions
 */
public abstract class Tipo_Grama extends Pokemon {
    public Tipo_Grama() {
        this.tipo = "Grama";
        this.tipoVantagem = "Terra";
        this.tipoFraqueza = "Fogo";
    }
}
