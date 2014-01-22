package affichage;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;
import javax.swing.Timer;

import algorithmes.Aleatoire;
import vehicules.*;

public class PanelGenerique extends JPanel implements ActionListener{


	private static final long serialVersionUID = 1L;
	private static final int GRIDNB=10;
	private static final int NBCARS=5;
	
    private ArrayList<JPanel> carList = new ArrayList<JPanel>();
    private PanelActionManager pam;
    
    private Timer timer;
    public PanelGenerique(){
        setLayout(new GridLayout(1,10));
        instanciateArray();
        instanciatePanels();
        generalStart();     
        pam=new PanelActionManager(this);
        
        KeyListener listener = new MyKeyListener(pam);
        addKeyListener(listener);
        setFocusable(true);
        timer = new Timer(30,this);
        timer.start();
    }
    public  ArrayList<JPanel> getCarList(){
        return carList;
    }
    
    public void instanciateArray (){
		for(int i = 0; i<GRIDNB; i++)
		if(Aleatoire.randomColumn())
		{
			Vehicule v = Aleatoire.createRandomVehicle(NBCARS);
			carList.add(v);
			add(v);
		}
		else
		{
			JPanel p=new JPanel();
			carList.add(p);
			add(p);
		}
    }
    
    public void instanciatePanels(){
        Iterator<JPanel> it = carList.iterator();
        
        while (it.hasNext()) {
               JPanel s = it.next();
               add(s);
        }
    }
    public void generalStart(){
        Iterator<JPanel> it = carList.iterator();
        
        while (it.hasNext()) {
               JPanel s = it.next();
               if(s instanceof Vehicule)
               {
            	   Vehicule t = (Vehicule)s;
            	   t.go();
               }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        for (int i=0; i<carList.size();i++){
               if(carList.get(i) instanceof Vehicule)
               {
            	   Vehicule v = (Vehicule)carList.get(i);
            	   if(v.outOfWindow())
            	   {
            		   System.out.println("vehicule sorti");
            		   pam.swapPanelIby(i, Aleatoire.createRandomVehicle(5));
            	   }
               }        
        }
    }
}