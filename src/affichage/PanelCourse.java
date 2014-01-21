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
    public PanelCourse (){
        setLayout(new GridLayout(1,10));
        instanciateArray();
        instanciatePanels();
        generalStart();
     
        
        KeyListener listener = new MyKeyListener(this);
        addKeyListener(listener);
        setFocusable(true);
        
    }
    public  ArrayList<Vehicule> getCarList(){
        return carList;
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
    

    public String randomLetter(){
        Random r = new Random();
        char c = (char) (r.nextInt(26) + 'A');
        return Character.toString(c);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        for (int i=0; i<carList.size();i++){
               if(carList.get(i).outOfWindow()){
                   System.out.println("vehicule sorti");
                   this.remove(carList.get(i));
                   carList.set(i, new VoitureBlanche("A"));
                   this.add(carList.get(i),i);
                   carList.get(i).go();
                   this.invalidate();
                   this.validate();
                   repaint();
               }
         
        }
       
 
    }
    



}





