package affichage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MyKeyListener implements KeyListener {

    
    private PanelActionManager actions;
    public MyKeyListener (PanelActionManager action){
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









