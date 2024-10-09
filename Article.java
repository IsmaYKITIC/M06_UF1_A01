public class Article {
    private String nom;
    private double quantitat;
    private String unitats;

    public Article(String nom, double quantitat, String unitats) {
        this.nom = nom;
        this.quantitat = quantitat;
        this.unitats = unitats;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public double getQuantitat() {
        return quantitat;
    }
    public void setQuantitat(double quantitat) {
        this.quantitat = quantitat;
    }
    public String getUnitats() {
        return unitats;
    }
    public void setUnitats(String unitats) {
        this.unitats = unitats;
    }
    
}

