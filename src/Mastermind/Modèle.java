package Mastermind;

public class Modèle<Etat> {
    private Etat etat;
    private Rangée combinaison;
    private Rangée[] propositions;
    private int tentative;

    public Modèle(){
        combinaison = new Rangée(tentative);
        propositions = new Rangée[10];
        for (int i = 0; i < propositions.length; i++) {
            propositions[i] = new Rangée(i);
        }
        tentative = 0;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Rangée getCombinaison() {
        return combinaison;
    }

    public void setCombinaison(Rangée combinaison) {
        this.combinaison = combinaison;
    }

    public Rangée[] getPropositions() {
        return propositions;
    }

    public void setPropositions(Rangée[] propositions) {
        this.propositions = propositions;
    }

    public int getTentative() {
        return tentative;
    }

    public void setTentative(int tentative) {
        this.tentative = tentative;
    }
}