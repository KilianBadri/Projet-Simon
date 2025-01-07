package fr.esgi.buisness;

import java.util.List;

public class Partie {
    public int id;
    public List<Joueur> lesJoueurs;
    public int NbJoueurs;

    public Partie(int id, List<Joueur> lesJoueurs, int NbJoueurs) {
        this.id = id;
        this.lesJoueurs = lesJoueurs;
        this.NbJoueurs = NbJoueurs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Joueur> getLesJoueurs() {
        return lesJoueurs;
    }

    public void setLesJoueurs(List<Joueur> lesJoueurs) {
        this.lesJoueurs = lesJoueurs;
    }

    public int getNbJoueurs() {
        return NbJoueurs;
    }

    public void setNbJoueurs(int NbJoueurs) {
        this.NbJoueurs = NbJoueurs;
    }
}
