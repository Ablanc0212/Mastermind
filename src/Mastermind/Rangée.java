package Mastermind;

import java.awt.Color;

public class Rangée extends Modèle {

    private Color[] jetons;
    private int indiceJeton;
    private int noirs;
    private int blancs;

    public Rangée(int DIFFICULTE) {
    	
        jetons = new Color[DIFFICULTE];
        indiceJeton = 0;
        noirs = 0;
        blancs = 0;
    }
    
    public void ajouterJeton(Color couleur) {
        jetons[indiceJeton] = couleur;
        indiceJeton++;
    }
    
    public Color[] getJetons() {
        return jetons;
    }
    
    public int getIndiceJeton() {
        return indiceJeton;
    }
    
    public void setResultat(int noirs, int blancs) {
        this.noirs = noirs;
        this.blancs = blancs;
    }
    
    public int getNoirs() {
        return noirs;
    }
    
    public int getBlancs() {
        return blancs;
    }
}