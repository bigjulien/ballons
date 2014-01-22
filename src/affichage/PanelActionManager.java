package affichage;

import java.util.ArrayList;
import java.util.Iterator;

import vehicules.Vehicule;
import vehicules.VoitureBlanche;

public class PanelActionManager {

    PanelCourse pC;
    
    public PanelActionManager (PanelCourse pC){
        this.pC=pC;
    }
    
    public void stopCarsWithLetter (char c){
        ArrayList<Vehicule> carList =pC.getCarList();
        Iterator<Vehicule> it = carList.iterator();
        
        while (it.hasNext()) {
               Vehicule s = it.next();
               if(c==s.getLettre().toLowerCase().charAt(0))
                   if (s.getTimer().isRunning())
                       s.stop();
                   else
                       s.restart();
        }
       
    }
    
    
    public void swapPanelIby (int i,Vehicule v){
        ArrayList<Vehicule> carList =pC.getCarList();
        pC.remove(carList.get(i));
        carList.set(i, new VoitureBlanche("A"));
        pC.add(carList.get(i),i);
        carList.get(i).go();
        pC.invalidate();
        pC.validate();
    }
    
    
}
