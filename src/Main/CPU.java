
package Main;

import ListaDePokemons.Bulbassauro;
import ListaDePokemons.Charmander;
import ListaDePokemons.Pikachu;
import ListaDePokemons.Sandshrew;
import ListaDePokemons.Squirtle;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Marcelo
 */
public class CPU extends Jogador {
    ImageIcon icone;

    public ImageIcon getIcone() {
        return icone;
    }

    public void setIcone(ImageIcon icone) {
        this.icone = icone;
    } 

       public CPU(){
           geraPokemon();
           
       }

      public Pokemon geraPokemon()
      {
          Random r; //criar um randomizador
        r = new Random();
        int i; //criar uma variavel
        i = r.nextInt(5); //a variavel vai de de 0 a 4
        //System.out.println(i);
        Pokemon p1 = new Pokemon() {};

        switch(i) {
            case 0:
               p1 = new Bulbassauro(); //se deu 5, cria um Bulbassauro
               //System.out.println("Bulbassauro criado");
               p1.imagem = new ImageIcon("src/SpritesESelectScreen/bulbassaur.png");
               break;
            case 1:
               p1 = new Pikachu(); //se deu 4, cria um Pikachu
               //System.out.println("Pikachu criado");
               p1.imagem = new ImageIcon("src/SpritesESelectScreen/pikachu.png");
                break;            
            case 2:
               p1 = new Charmander(); //se deu 2, cria um Charmander
               //System.out.println("Charmander criado");
               p1.imagem = new ImageIcon("src/SpritesESelectScreen/charmander.png");
               break;               
            case 3:
               p1 = new Sandshrew(); //se deu 3, cria um Sandshrew
               //System.out.println("Sandshrew criado");
               p1.imagem = new ImageIcon("src/SpritesESelectScreen/sandshrew.png");
               break;
            case 4:
               p1 = new Squirtle(); //se deu 1, cria um Squirtle
               //System.out.println("Squirtle criado");
               p1.imagem = new ImageIcon("src/SpritesESelectScreen/squirtle.png");
               break;            
        }
        return p1;
      }
      
    @Override
      public void setJogada(int jogada)
    {
        super.setJogada(jogada);
        ImageIcon icon = new ImageIcon();
        if(jogada == 1) {            
                icon = new ImageIcon("src/PedraPapelTesoura/bp.png");
        }
        else {
            if(jogada == 2) {
                icon = new ImageIcon("src/PedraPapelTesoura/bpa.png");
            }
            else {
                icon = new ImageIcon("src/PedraPapelTesoura/bt.png");
            }
        }        
        this.setIcone(icon);
    }

     public void cpuJogada(){
          Random r;
          r = new Random();
          int jg;
           jg = r.nextInt(3)+1; // vai de 1 a 3 
          
          this.setJogada(jg); 
          
          
      }

}