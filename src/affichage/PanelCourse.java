package affichage;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JPanel;

import vehicules.Camion;
import vehicules.GrosCamion;
import vehicules.Vehicule;
import vehicules.VoitureBlanche;
import vehicules.VoitureJaune;
import vehicules.VoitureRouge;
import vehicules.VoitureVerte;

public class PanelCourse extends JPanel {

    private ArrayList<Vehicule> carList = new ArrayList();

    public PanelCourse (){
        setLayout(new GridLayout(1,10));
        instanciateArray();
        instanciatePanels();
        generalStart();
    }
    
    public void instanciateArray (){
        carList.add(new VoitureRouge(randomLetter()));
        carList.add(new GrosCamion(randomLetter()));
        carList.add(new Camion(randomLetter()));
        carList.add(new VoitureVerte(randomLetter()));
        carList.add(new VoitureJaune(randomLetter()));
        carList.add(new VoitureVerte(randomLetter()));
        carList.add(new VoitureBlanche(randomLetter()));
        carList.add(new VoitureBlanche(randomLetter()));
        carList.add(new VoitureBlanche(randomLetter()));
        carList.add(new VoitureRouge(randomLetter()));
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
    

    public String randomLetter(){
        Random r = new Random();
        char c = (char) (r.nextInt(26) + 'a');
        return Character.toString(c);
    }

}
