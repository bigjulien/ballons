package affichage;

import java.awt.*;

import javax.swing.*;

import vehicules.*;
import algorithmes.*;

public class PanelExplosion extends JPanel{
	private static final int GRIDNB=10;
	private static final long serialVersionUID = 1L;	
		
	public PanelExplosion(){	    
	    setLayout(new GridLayout(1,GRIDNB));   
	    Vehicule v= new VoitureVerte("G");
	    add(v);
	    popVoitures();
	}
	
	private void popVoitures()
	{
		
			
		}
	}
}
