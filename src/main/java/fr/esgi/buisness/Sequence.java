package fr.esgi.buisness;

import java.util.List;

public class Sequence {
    public int id;
    public List<Bouton> lesBoutons;
    public int nbTours;

    public Sequence(int id, List<Bouton> lesBoutons, int nbTours) {
        this.id = id;
        this.lesBoutons = lesBoutons;
        this.nbTours = nbTours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Bouton> getLesBoutons() {
        return lesBoutons;
    }

    public void setLesBoutons(List<Bouton> lesBoutons) {
        this.lesBoutons = lesBoutons;
    }

    public int getNbTours() {
        return nbTours;
    }

    public void setNbTours(int nbTours) {
        this.nbTours = nbTours;
    }
}
