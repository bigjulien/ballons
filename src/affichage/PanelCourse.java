package affichage;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

import algorithmes.Aleatoire;
import vehicules.Camion;
import vehicules.GrosCamion;
import vehicules.Vehicule;
import vehicules.VoitureBlanche;
import vehicules.VoitureJaune;
import vehicules.VoitureRouge;
import vehicules.VoitureVerte;

public class PanelCourse extends JPanel implements ActionListener {

    private ArrayList<Vehicule> carList = new ArrayList();
    private Timer timer;
    private PanelActionManager pam;
    public PanelCourse (){
        setLayout(new GridLayout(1,10));
        instanciateArray();
        instanciatePanels();
        generalStart();
     
        pam=new PanelActionManager(this);
        // YO LO
        KeyListener listener = new MyKeyListener(this,pam);
        addKeyListener(listener);
        setFocusable(true);
        
    }
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
    

  
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        for (int i=0; i<carList.size();i++){
               if(carList.get(i).outOfWindow()){
                   System.out.println("vehicule sorti");
                   pam.swapPanelIby(i, Aleatoire.createRandomVehicle(5));
               }
         
        }
       
 
    }
    



}





