package affichage;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

import vehicules.Vehicule;

public class PanelActionManager {

PanelGenerique pC;

public PanelActionManager(PanelGenerique pC) {
    this.pC = pC;
}

/**
 * Renvoit l'indice dans la Liste des Panels (Vehicules) des vehicules ayant la
 * lettre c
 * 
 * @param c
 *            charactere considéré
 * @return
 */
public ArrayList<Integer> getCarsWithLetter(String c){
    ArrayList<Integer> indices= new ArrayList();
    ArrayList<JPanel> carList = pC.getCarList();
    Iterator<JPanel> it = carList.iterator();

    for (int i=0; i<carList.size();i++){
        if (carList.get(i) instanceof Vehicule){
            Vehicule v = (Vehicule)carList.get(i);
            if (v.getLettre().equals(c))
                indices.add(i);   
        }
    }
    return indices;
    
}

public void stopCarsWithLetter(String c) {
    ArrayList<Integer> indices = getCarsWithLetter(c);
    Iterator<Integer> it = indices.iterator();

    while (it.hasNext()) {
        int i = it.next();
        Vehicule v = (Vehicule) pC.getCarList().get(i);
        if (v.getTimer().isRunning()) 
                v.stop();
        pC.getCarList().set(i,v);
    }

}

public void startCarsWithLetter(char c) {
    
}

public void detruire(JPanel jPanel) {
    if (jPanel instanceof Vehicule){
        Vehicule vehicule = (Vehicule) jPanel;
        vehicule.destroyTimer();
    }
    jPanel = null;
}

public void swapPanelIby(int i, Vehicule v) {
    ArrayList<JPanel> carList = pC.getCarList();
    detruire(carList.get(i));
    pC.remove(carList.get(i));
    carList.set(i, v);
    pC.add(carList.get(i), i);
    if (carList.get(i) instanceof Vehicule){
        Vehicule vehicule = (Vehicule) carList.get(i);
        vehicule.destroyTimer();
        vehicule.go();
    }
    
    pC.invalidate();
    pC.validate();
}

}
