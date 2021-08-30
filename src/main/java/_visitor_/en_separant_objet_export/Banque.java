package _visitor_.en_separant_objet_export;

public class Banque implements Poi {

    private boolean avecDistributeur;

    public Banque(boolean avecDistributeur) {
        this.avecDistributeur = avecDistributeur;
    }

    public boolean isAvecDistributeur() {
        return avecDistributeur;
    }

}
