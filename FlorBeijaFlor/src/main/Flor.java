/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Observable;

/**
 *
 * @author User
 */
public class Flor extends Observable {
    private boolean aberta;
    public Flor(){
    }
    
    public void abrir(){
        this.setAberta(true);
        setChanged();
        notifyObservers(this.isAberta());
    }
    public void fechar(){
        this.setAberta(false);
        setChanged();
        notifyObservers(this.isAberta());
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
}
