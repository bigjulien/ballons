package CourseVariant;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import vehicules.*;
import affichage.PanelGenerique;
import algorithmes.Aleatoire;

public class PanelCourse extends PanelGenerique implements ActionListener {

private static final long serialVersionUID = 1L;


public PanelCourse(){
     System.out.println("babar");
}

@Override
public void instanciateArray() {
    Vehicule v = new VoiturePolice("");
    carList.add(v);
    for (int i = 0; i < GRIDNB-1; i++) {
        Vehicule w = Aleatoire.createRandomVehicle(NBCARS);
        carList.add(w);
        add(w);
    }
}

}
