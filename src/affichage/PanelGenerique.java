package affichage;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;
import javax.swing.Timer;

import vehicules.Camion;
import vehicules.GrosCamion;
import vehicules.Vehicule;
import vehicules.VoitureBlanche;
import vehicules.VoitureJaune;
import vehicules.VoitureRouge;
import vehicules.VoitureVerte;
import algorithmes.Aleatoire;

public class PanelGenerique extends JPanel{
	private ArrayList<Vehicule> carList = new ArrayList();
    public  ArrayList<Vehicule> getCarList(){
        return carList;
    }
    
    public void instanciateArray (){
        carList.add(new VoitureRouge(Aleatoire.randomLetter()));
        carList.add(new GrosCamion(Aleatoire.randomLetter()));
        carList.add(new Camion(Aleatoire.randomLetter()));
        carList.add(new VoitureVerte(Aleatoire.randomLetter()));
        carList.add(new VoitureJaune(Aleatoire.randomLetter()));
        carList.add(new VoitureVerte(Aleatoire.randomLetter()));
        carList.add(new VoitureBlanche(Aleatoire.randomLetter()));
        carList.add(new VoitureBlanche(Aleatoire.randomLetter()));
        carList.add(new VoitureBlanche(Aleatoire.randomLetter()));
        carList.add(new VoitureRouge(Aleatoire.randomLetter()));
        timer = new Timer(100,this);
        timer.start();
    }
    
    public void instanciatePanels(){
        Iterator<Vehicule> it = carList.iterator();
        
        while (it.hasNext()) {
               Vehicule s = it.next();
               add(s);
        }
    }
    public void generalStart(){
        Iterator<Vehicule> it = carList.iterator();
        
        while (it.hasNext()) {
               Vehicule s = it.next();
               s.go();
        }
    }

}
