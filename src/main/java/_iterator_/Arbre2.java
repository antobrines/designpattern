package _iterator_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arbre2 implements Iterable<Arbre2> {

    public class Arbre2Iterator implements Iterator<Arbre2> {
        private List<Arbre2> list = new ArrayList<Arbre2>();

        Arbre2Iterator(Arbre2 arbre) {
            list.add(arbre);
        }

        @Override
        public boolean hasNext() {
            return !list.isEmpty();
        }

        @Override
        public Arbre2 next() {
            Arbre2 result = list.remove(0);
            if (result.getSousArbreGauche() != null)
                list.add(result.getSousArbreGauche());
            if (result.getSousArbreDroit() != null)
                list.add(result.getSousArbreDroit());
            return result;
        }
    }

    private String valeur;
    private Arbre2 sousArbreGauche;
    private Arbre2 sousArbreDroit;

    public Arbre2(String valeur) {
        this.valeur = valeur;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Arbre2 getSousArbreGauche() {
        return sousArbreGauche;
    }

    public Arbre2 getSousArbreDroit() {
        return sousArbreDroit;
    }

    public void setSousArbreGauche(Arbre2 sousArbreGauche) {
        this.sousArbreGauche = sousArbreGauche;
    }

    public void setSousArbreDroit(Arbre2 sousArbreDroit) {
        this.sousArbreDroit = sousArbreDroit;
    }

    @Override
    public Iterator<Arbre2> iterator() {
        return new Arbre2Iterator(this);
    }
}
