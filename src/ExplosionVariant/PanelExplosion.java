package ExplosionVariant;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;
import vehicules.Vehicule;
import affichage.MyKeyListener;
import affichage.PanelActionManager;
import affichage.PanelGenerique;
import algorithmes.Aleatoire;

public class PanelExplosion extends PanelGenerique{
	
	private static final long serialVersionUID = 1L;
	
    public PanelExplosion(){
        setLayout(new GridLayout(1,10));
        instanciateArray();       
        generalStart();     
        pam=new PanelActionManager(this);        
        KeyListener listener = new MyKeyListener(pam);
        addKeyListener(listener);
        setFocusable(true);
        timer = new Timer(30,this);
        timer.start();
    }
	
    @Override
	public void actionPerformed(ActionEvent e) {
	        
	for (int i=0; i<carList.size();i++){
	     if(carList.get(i) instanceof Vehicule)
	     {
	          Vehicule v = (Vehicule)carList.get(i);
	          if(v.outOfWindow())
	          {           		   
	            	pam.swapPanelIby(i, Aleatoire.createRandomVehicle(5));
	            	
	          }
	     }        
	 }
     }
}
	

