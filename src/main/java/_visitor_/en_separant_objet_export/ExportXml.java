package _visitor_.en_separant_objet_export;

public class ExportXml {

    public String exportBanque(Banque b) {
        return "<banque avecDistributeur=" + b.isAvecDistributeur() + "></banque>";
    }

    public String exportCinema(Cinema c) {
        return "<cinema heureFermeture=" + c.getHeureFermeture() + "></cinema>";
    }
}
