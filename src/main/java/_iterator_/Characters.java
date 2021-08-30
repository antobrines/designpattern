package _iterator_;

import java.util.Iterator;

public class Characters implements Iterable<String> {

    //private List<String> personnages = new ArrayList<>();

    private String[][] personnages = new String[10][];

    @Override
    public Iterator<String> iterator() {
        //  return personnages.iterator();
        return null;
    }

    public String getCharactersAt(int x, int y) {
        return personnages[x][y];
    }
}
