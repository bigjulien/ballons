package ExplosionVariant;

import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;

import vehicules.Vehicule;
import affichage.PanelGenerique;
import algorithmes.Aleatoire;

public class PanelExplosion extends PanelGenerique{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	

