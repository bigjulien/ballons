package affichage;

import java.awt.*;
import javax.swing.*;
import vehicules.*;

public class FenetrePpaleExplosion extends JPanel{

	private static final long serialVersionUID = 1L;	
		
	public FenetrePpaleExplosion(){	    
	    setLayout(new GridLayout(1,10));	    
	    add(new VoitureRouge("A"));
	    add(new VoitureRouge("A"));
	    add(new VoitureRouge("A"));
	    add(new VoitureVerte("A"));
	    add(new VoitureRouge("A"));
	    add(new JPanel());
	    add(new JPanel());
	    add(new VoitureRouge("A"));
	    add(new JPanel());
	    add(new VoitureRouge("A"));
	}
	

}
