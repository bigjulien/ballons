package affichage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;

import vehicules.Vehicule;

public class MyKeyListener implements KeyListener {

    private PanelCourse pC;
    private PanelActionManager actions;
    public MyKeyListener (PanelCourse pC,PanelActionManager action){
        this.pC=pC;
        actions = action;
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
            actions.stopCarsWithLetter(c);
                   
             
           
        }
    
    

    
    
}









