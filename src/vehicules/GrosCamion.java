package vehicules;

public class GrosCamion extends Vehicule {

private static final long serialVersionUID = 1L;
private static final int vitesse = 80;
private static final String lien = "voitures/campion.png";
    public GrosCamion(String lettre) {
        super(lettre);
        setImage(lien);
        go(vitesse);
    }
    
}
