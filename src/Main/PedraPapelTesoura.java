/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Marcelo
 */
public class PedraPapelTesoura {

    Jogador j;
    CPU c;

    public PedraPapelTesoura(Jogador j, CPU c) {
        this.j = j;
        this.c = c;
    }

    public int jogaPedraPapelTesoura() {
        
        int q;
        if (j.getJogada() == c.getJogada()) {
            System.out.println("empate");
            q = 0;
            
            
        } else if ((j.getJogada() == 1 && c.getJogada() == 3) || (j.getJogada() == 2 && c.getJogada() == 1) || (j.getJogada() == 3 && c.getJogada() == 2)) {
            System.out.println("vitoria");
            q = 1;
            
            
        } else {
            System.out.println("derrota");
            q = -1;
            
        }
        return q;
    }
    
   }
