package _iterator_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {

    public static void main(String[] args) {

        MonContainer monContainer = new MonContainer();
        monContainer.add("abc");
        monContainer.add("xyz");

        //...
        traitement(monContainer);

        Map<String, String> map = new HashMap<>();

        map.entrySet().iterator();

        System.out.println("-------------------");
        System.out.println("ARBRE");
        Arbre a = new Arbre("A");
        Arbre b = new Arbre("B");
        Arbre c = new Arbre("C");
        Arbre d = new Arbre("D");
        a.setSousArbreGauche(b);
        a.setSousArbreDroit(c);
        c.setSousArbreGauche(d);
        //
        //         A
        //    B          C
        //  .   .      D   .

        parcourirArbre(a);
        traitement(a);

        //exemple boucle For each si utilisation des interface Iterator/Iterable de java.util.
        Iterable<String> exempleIterableJava = new ArrayList<>();///
        for (String elem : exempleIterableJava) {

        }


        Arbre2 a1 = new Arbre2("1");
        Arbre2 a2 = new Arbre2("2");
        Arbre2 a3 = new Arbre2("3");
        Arbre2 a4 = new Arbre2("4");

        a1.setSousArbreGauche(a2);
        a1.setSousArbreDroit(a3);
        a3.setSousArbreGauche(a4);
        for (Arbre2 arbre : a1) {
            System.out.println(arbre.getValeur());
        }


    }

    // Déplacer cette responsabilité dans ArbreIterator
    private static void parcourirArbre(Arbre arbre) {
        List<Arbre> list = new ArrayList<>();
        list.add(arbre);
        while (!list.isEmpty()) {
            Arbre a = list.remove(0);
            System.out.println(a.getValeur());
            if (a.getSousArbreGauche() != null)
                list.add(a.getSousArbreGauche());
            if (a.getSousArbreDroit() != null)
                list.add(a.getSousArbreDroit());
        }
    }

    private static void traitement(MyIterable iterable) {
        for (MyIterator iterator = iterable.createIterator(); iterator.hasNext(); ) {
            String elem = iterator.next();
            System.out.println(elem);
        }
    }

}
