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
	    
	    
	    add(new VoitureRouge("A"));
	    add(new VoitureVerte("A"));
	    add(new VoitureRouge("A"));
	    add(new JPanel());
	    add(new JPanel());
	    add(new VoitureRouge("A"));
	    add(new JPanel());
	    add(new VoitureRouge("A"));
	}
	
	private void popVoiture()
	{
		for(int i =0; i<GRIDNB;i++)
		{
			if(Aleatoire.randomColumn())
			{
				String lettre = Aleatoire.randomLetter();
				Vehicule v= new VoitureRouge(lettre);
			    add(v);
			    v.go();
			}
		}
		
	}
	

}
