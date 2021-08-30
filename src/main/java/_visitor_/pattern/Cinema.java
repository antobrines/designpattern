package _visitor_.pattern;

public class Cinema implements Poi {

    private int heureFermeture;

    public Cinema(int heureFermeture) {
        this.heureFermeture = heureFermeture;
    }


    public int getHeureFermeture() {
        return heureFermeture;
    }

    @Override
    public String accept(PoiVisitor v) {
        return v.visit(this);
    }
}
