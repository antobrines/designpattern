package _visitor_.pattern;

public class ExportCsvPoiVisitor implements PoiVisitor {
    @Override
    public String visit(Banque b) {
        return "banque;" + b.isAvecDistributeur();
    }

    @Override
    public String visit(Cinema c) {
        return "cinema;" + c.getHeureFermeture();
    }
}
