package _visitor_.en_separant_objet_export;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Poi> pois = new ArrayList<>();
        pois.add(new Cinema(23));
        pois.add(new Cinema(2));
        pois.add(new Banque(true));
        //...

        exportXml(pois);

    }

    private static void exportXml(List<Poi> pois) {
        ExportXml exportXml = new ExportXml();

        String xml = "<export>";
        for (Poi poi : pois) {
            if (poi instanceof Banque) {
                xml += exportXml.exportBanque((Banque) poi);
            }
            if (poi instanceof Cinema) {
                xml += exportXml.exportCinema((Cinema) poi);
            }
        }
        xml += "</export>";
        System.out.println(xml);
    }
}
