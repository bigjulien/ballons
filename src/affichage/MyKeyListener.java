package affichage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;

import vehicules.Vehicule;

public class MyKeyListener implements KeyListener {

    private PanelCourse pC;
    
    public MyKeyListener (PanelCourse pC){
        this.pC=pC;
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
            ArrayList<Vehicule> carList =pC.getCarList();
            Iterator<Vehicule> it = carList.iterator();
            
            while (it.hasNext()) {
                   Vehicule s = it.next();
                   if(arg0.getKeyChar()==s.getLettre().toLowerCase().charAt(0))
                       if (s.getTimer().isRunning())
                           s.getTimer().stop();
                       else
                           s.restart();
            }
           
        }

    
    
}









