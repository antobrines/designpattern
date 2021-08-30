package _visitor_.pattern;

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
        ExportXmlPoiVisitor exportXmlPoiVisitor = new ExportXmlPoiVisitor();

        String xml = "<export>";
        for (Poi poi : pois) {
            xml += poi.accept(exportXmlPoiVisitor);
        }
        xml += "</export>";
        System.out.println(xml);
    }
}
