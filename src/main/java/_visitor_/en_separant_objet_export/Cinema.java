package _visitor_.en_separant_objet_export;

public class Cinema implements Poi {

    private int heureFermeture;

    public Cinema(int heureFermeture) {
        this.heureFermeture = heureFermeture;
    }


    public int getHeureFermeture() {
        return heureFermeture;
    }
}
