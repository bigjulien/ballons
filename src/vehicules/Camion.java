package vehicules;

public class Camion extends Vehicule{

private static final long serialVersionUID = 1L;
private static final int vitesse = 60;
private static final String lien = "voitures/campion.png";
    public Camion(String lettre) {
        super(lettre);
        setImage(lien);
        setVitesse(vitesse);
    }
}
