package affichage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;

import vehicules.Vehicule;

public class MyKeyListener implements KeyListener {

    private PanelCourse pC;
    private PanelActionManager Actions;
    public MyKeyListener (PanelCourse pC){
        this.pC=pC;
        Actions = new PanelActionManager (pC);
    }
    
    @Override
    public void keyPressed(KeyEvent arg0) {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void keyTyped(KeyEvent arg0) {
            char c = arg0.getKeyChar();
            Actions.stopCarsWithLetter(c);
                   
             
           
        }
    
    

    
    
}









