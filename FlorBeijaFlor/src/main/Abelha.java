/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author User
 */
public class Abelha implements Observer {
    boolean estadoFlor;

    public Abelha() {
    }
   
    @Override
    public void update(Observable o, Object arg) {
        this.estadoFlor = (boolean) arg;
        if (estadoFlor == true){
            System.out.println("boia abelha");
        }
        else {
            System.out.println("voe abelha");
        }
    }
}
