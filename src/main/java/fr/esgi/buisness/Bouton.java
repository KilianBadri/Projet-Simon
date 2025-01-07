package fr.esgi.buisness;

public class Bouton {
    private int id;
    private Couleurs couleur;
    private Bruits bruit;

    public Bouton(int id, Couleurs couleur, Bruits bruit) {
        this.id = id;
        this.couleur = couleur;
        this.bruit = bruit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Couleurs getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleurs couleur) {
        this.couleur = couleur;
    }

    public Bruits getBruit() {
        return bruit;
    }

    public void setBruit(Bruits bruit) {
        this.bruit = bruit;
    }

}
