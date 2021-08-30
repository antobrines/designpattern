package _visitor_.pattern;

public interface Poi {

    String accept(PoiVisitor v);
}
