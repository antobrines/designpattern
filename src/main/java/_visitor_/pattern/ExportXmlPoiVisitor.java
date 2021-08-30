package _visitor_.pattern;

public class ExportXmlPoiVisitor implements PoiVisitor {
    @Override
    public String visit(Banque b) {
        return "<banque avecDistributeur=" + b.isAvecDistributeur() + "></banque>";
    }

    @Override
    public String visit(Cinema c) {
        return "<cinema heureFermeture=" + c.getHeureFermeture() + "></cinema>";
    }
}
