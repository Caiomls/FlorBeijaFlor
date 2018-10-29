/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author User
 */
public class FlorBeijaFlor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BeijaFlor beijaflor = new BeijaFlor();
        Flor flor = new Flor();
        Abelha abelha = new Abelha();
        flor.addObserver(abelha);
        flor.addObserver(beijaflor);
        flor.fechar();
        flor.abrir();
    }
    
}
