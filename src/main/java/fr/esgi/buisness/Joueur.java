package fr.esgi.buisness;

public class Joueur {
    private int id;
    private String nom;
    private int score;
    private boolean enJeu;

    public Joueur(int id, String nom, int score, boolean enJeu) {
        this.id = id;
        this.nom = nom;
        this.score = score;
        this.enJeu = enJeu;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean getEnJeu() {
        return this.enJeu;
    }

    public void setEnJeu(boolean enJeu) {
        this.enJeu = enJeu;
    }
}
