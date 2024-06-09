/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meujogo;

import javax.swing.JFrame;
import meujogo.modelo.Fase;

/**
 *
 * @author rians
 */
public class Conteiner extends JFrame {
    public Conteiner (){
        add(new Fase());
        setTitle("Meu Jogo");
        setSize(1024, 728);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
        setVisible(true);
        
    
    }
    public static void main(String []args){
        new Conteiner();
    }
}
