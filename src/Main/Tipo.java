/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author ice
 */
public abstract class Tipo {
    protected String tipo;
    protected String efetividade;
    
    public Tipo () {
        //
    }
    public String getTipo() {
        return this.tipo;
    }
    /*
    public String getEfetividade(Pokemon inimigo) {
        
        String tipoInimigo = inimigo.getTipo();
        String meuTipo = this.tipo;
        switch(meuTipo) {
            case "fogo":
                if(tipoInimigo.equals("agua") || tipoInimigo.equals("pedra")) {
                    return "pouco efetivo";
                } else if(tipoInimigo.equals("planta") || tipoInimigo.equals("fogo")) {
                    return "super efetio";
                }
                break;
            case "agua":
                 if(tipoInimigo.equals("planta") || tipoInimigo.equals("eletrico")) {
                    return "pouco efetivo";
                } else if(tipoInimigo.equals("fogo") || tipoInimigo.equals("pedra")) {
                    return "super efetio";
                }
                break;
            case "planta":
                 if(tipoInimigo.equals("fogo") || tipoInimigo.equals("pedra")) {
                    return "pouco efetivo";
                } else if(tipoInimigo.equals("agua") || tipoInimigo.equals("eletrico")) {
                    return "super efetio";
                }
                break;
            case "eketrico":
                 if(tipoInimigo.equals("pedra") || tipoInimigo.equals("planta")) {
                    return "pouco efetivo";
                } else if(tipoInimigo.equals("agua") || tipoInimigo.equals("eletrico")) {
                    return "super efetio";
                }
                break;
            case "pedra":
                 if(tipoInimigo.equals("agua") || tipoInimigo.equals("planta")) {
                    return "pouco efetivo";
                } else if(tipoInimigo.equals("eletrico") || tipoInimigo.equals("pedra")) {
                    return "super efetio";
                }
                break;

        }
        return "normal";
        */
    }   

