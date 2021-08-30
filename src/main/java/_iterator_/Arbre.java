package _iterator_;

public class Arbre implements MyIterable {

    public Arbre(String valeur) {
        this.valeur = valeur;
    }

    private String valeur;
    private Arbre sousArbreGauche;
    private Arbre sousArbreDroit;

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Arbre getSousArbreGauche() {
        return sousArbreGauche;
    }

    public void setSousArbreGauche(Arbre sousArbreGauche) {
        this.sousArbreGauche = sousArbreGauche;
    }

    public Arbre getSousArbreDroit() {
        return sousArbreDroit;
    }

    public void setSousArbreDroit(Arbre sousArbreDroit) {
        this.sousArbreDroit = sousArbreDroit;
    }

    @Override
    public MyIterator createIterator() {
        return new ArbreIterator(this);
    }
}
