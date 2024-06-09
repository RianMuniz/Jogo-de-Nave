/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meujogo.modelo;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author rians
 */
public class Enemy1 {
    private Image imagem;
    private int x, y;
    private int largura , altura;
    private boolean isVisivel;
    
    
//    private static final int LARGURA = 938;
    private static int VELOCIDADE= 2;
    
    public Enemy1(int x, int y){
        this.x = x;
        this.y=y;
        isVisivel=true;
        
    }
    public void load(){
        ImageIcon referencia = new ImageIcon(getClass().getResource("/res/super-jogo.png"));
        imagem = referencia.getImage();
    
        this.largura = imagem.getWidth(null);
        this.altura = imagem.getHeight(null);
    
    }
    public void update(){
        this.x -= VELOCIDADE;
//        if(this.x > LARGURA)
//{
            //isVisivel = false;
//        }
    }
    
        public Rectangle getBounds(){
        return new Rectangle(x,y,largura, altura);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public Image getImagem() {
        return imagem;
    }
    

    public void setY(int y) {
        this.y = y;
    }

    public boolean isIsVisivel() {
        return isVisivel;
    }

    public void setVisivel(boolean isVisivel) {
        this.isVisivel = isVisivel;
    }

    public static int getVELOCIDADE() {
        return VELOCIDADE;
    }

    public static void setVELOCIDADE(int VELOCIDADE) {
        Enemy1.VELOCIDADE = VELOCIDADE;
    }





}
