package _visitor_.pattern;

public interface PoiVisitor {
    String visit(Banque b);
    String visit(Cinema c);
}
