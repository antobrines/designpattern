package _visitor_.intermediaire;

public class Banque implements Poi {

    private boolean avecDistributeur;

    public Banque(boolean avecDistributeur) {
        this.avecDistributeur = avecDistributeur;
    }

    public boolean isAvecDistributeur() {
        return avecDistributeur;
    }

    @Override
    public String exportXml() {
        return "<banque avecDistributeur=" + avecDistributeur + "></banque>";
    }
}
