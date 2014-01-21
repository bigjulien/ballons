package affichage;

import java.awt.GridLayout;

import javax.swing.JPanel;

import vehicules.VoitureRouge;
import vehicules.VoitureVerte;

public class PanelCourse extends JPanel {


    public PanelCourse (){
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
