package fr.esgi.buisness;

import java.util.List;

public class Cadran {
    private int id;
    private List<Bouton> lesBoutons;

    public Cadran(int id, List<Bouton> lesBoutons) {
        this.id = id;
        this.lesBoutons = lesBoutons;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Bouton> getLesBoutons() {
        return this.lesBoutons;
    }

    public void setLesBoutons(List<Bouton> lesBoutons) {
        this.lesBoutons = lesBoutons;
    }
}
