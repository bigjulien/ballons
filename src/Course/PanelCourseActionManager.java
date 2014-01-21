package Course;

import java.util.ArrayList;
import java.util.Iterator;

import affichage.PanelCourse;
import vehicules.Vehicule;

public class PanelCourseActionManager {

    PanelCourse pC;
    
    public PanelCourseActionManager (PanelCourse pC){
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
    
    
}
