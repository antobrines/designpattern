package _visitor_.intermediaire;

public class Cinema implements Poi {

    private int heureFermeture;

    public Cinema(int heureFermeture) {
        this.heureFermeture = heureFermeture;
    }


    public int getHeureFermeture() {
        return heureFermeture;
    }

    @Override
    public String exportXml() {
        return "<cinema heureFermeture="+heureFermeture+"></cinema>";
    }
}
