package affichage;

import java.awt.*;

import javax.swing.*;

import vehicules.*;
import algorithmes.*;

public class PanelExplosion extends JPanel{
	private static final int GRIDNB=10;
	private static final int NBCARS=5;
	private static final long serialVersionUID = 1L;	
		
	public PanelExplosion(){	    
	    setLayout(new GridLayout(1,GRIDNB));   
	    popVoitures();
	}
	
	private void popVoitures()
	{
		for(int i = 0; i<GRIDNB; i++)
		if(Aleatoire.randomColumn())
		{
			Vehicule v = Aleatoire.createRandomVehicle(NBCARS);
			add(v);
			v.go();
		}
		else
		{
			Panel p=new Panel();
			add(p);
		}
	}
}
