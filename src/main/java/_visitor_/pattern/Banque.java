package _visitor_.pattern;

public class Banque implements Poi {

    private boolean avecDistributeur;

    public Banque(boolean avecDistributeur) {
        this.avecDistributeur = avecDistributeur;
    }

    public boolean isAvecDistributeur() {
        return avecDistributeur;
    }

    @Override
    public String accept(PoiVisitor v) {
        return v.visit(this);
    }
}
