/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meujogo.modelo;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.List;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author rians
 */
public class Player {
    private int x, y;
    private int dx , dy;
    private Image imagem;
    private int altura, largura;
    private List<Tiro> tiros;
    private boolean isVisivel;
    
    
    public Player(){
        this.x=100;
        this.y = 100;
        isVisivel =true;
        tiros = new ArrayList<Tiro>();
    }
    public void load(){
        ImageIcon referencia = new ImageIcon(getClass().getResource("/res/homem.de.ferro.png"));
        imagem = referencia.getImage();
        altura = imagem.getHeight(null);
        largura = imagem.getWidth(null);
        
    }
    public void update (){
        x +=dx;
        y+=dy;
    }
    public void TiroSimples(){
        this.tiros.add(new Tiro(x+largura, y + (altura/2)));
    }
    
    public Rectangle getBounds(){
        return new Rectangle(x,y,largura, altura);
    }
    
    public void keyPressed(KeyEvent tecla){
        int codigo = tecla.getKeyCode();
        
         if(codigo == KeyEvent.VK_A){
            TiroSimples();
        }
        
        if(codigo == KeyEvent.VK_UP){
            dy = -3;
        }
         if(codigo == KeyEvent.VK_DOWN){
            dy =3;
        } if(codigo == KeyEvent.VK_LEFT){
            dx =-3;
        } if(codigo == KeyEvent.VK_RIGHT){
            dx =3;
        }
    }
        public void keyRelease(KeyEvent tecla){
        int codigo = tecla.getKeyCode();
        if(codigo == KeyEvent.VK_UP){
            dy = 0;
        }
         if(codigo == KeyEvent.VK_DOWN){
            dy =0;
        } if(codigo == KeyEvent.VK_LEFT){
            dx =0;
        } if(codigo == KeyEvent.VK_RIGHT){
            dx =0;
        }
        
    }

    public boolean isIsVisivel() {
        return isVisivel;
    }

    public void setVisivel(boolean isVisivel) {
        this.isVisivel = isVisivel;
    }
        

    public int getX() {
        return x;
    }

  

    public int getY() {
        return y;
    }



    public Image getImagem() {
        return imagem;
    }

    public List<Tiro> getTiros() {
        return tiros;
    }

  


}















