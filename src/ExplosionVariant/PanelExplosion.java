package ExplosionVariant;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.Timer;
import vehicules.Vehicule;
import affichage.PanelActionManager;
import affichage.PanelGenerique;
import algorithmes.Aleatoire;

public class PanelExplosion extends PanelGenerique{
	
	private static final long serialVersionUID = 1L;
	
    public PanelExplosion(){
        setLayout(new GridLayout(1,10));
        instanciateArray();       
        generalStart();   
        System.out.println(carList.toString());
        pam=new PanelActionManager(this);        
        KeyListenerExplosion listener = new KeyListenerExplosion(pam);
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
	        	    if(Aleatoire.randomBoolean())
	        	    {
	        	    	pam.swapPanelIby(i, Aleatoire.createRandomVehicle(5));
	        	    }
	        	    else
	        	    {
	        	    	
	        	    }
	          }
	     }
	     else
	     {
	    	 
	     }
	 }
     }
}
	

