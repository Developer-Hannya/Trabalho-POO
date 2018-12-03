/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import ListaDePokemons.*;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author berna
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Teste para saber se a janela abre a imagem do pokemon
        Bulbassauro p1 = new Bulbassauro();
        JFrame j = new JFrame();
        j.setSize(640, 480);
        j.setLocationRelativeTo(null);
        j.setVisible(true);
        JLabel l = new JLabel(p1.imagem, JLabel.CENTER);
        //l.setIcon(p1.getImagem());
        j.add(l);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        /*
        //Teste para saber se o Pikachu herda as caracteristicas do Tipo_Eetrico
        Pikachu p1 = new Pikachu();
        System.out.println(p1.nome);
        System.out.println(p1.tipoFraqueza);
         */
        
    }
    
}
