package _visitor_.intermediaire;

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
        String xml = "<export>";
        for (Poi poi : pois) {
            xml += poi.exportXml();
        }
        xml += "</export>";
        System.out.println(xml);
    }
}
