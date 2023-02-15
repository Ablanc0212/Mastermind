package Mastermind;

import javax.swing.JPanel;

public class Contrôleur {

	private static boolean clicBouton;
	private static boolean doubleClic;

	public static void controleJeu(JPanel proposalsPanel) {
		int nbTentatives = 10;
		int[] combinaison = choisirCombinaison();
		int[] propositionEnCours = new int[4];
		int indexPropositionEnCours = 0;
		boolean partieGagnee = false;
		boolean partiePerdue = false;
		{

			while (nbTentatives > 0 && !partieGagnee && !partiePerdue) {
				if (clicBouton) {
					int jeton = 0;
					propositionEnCours[indexPropositionEnCours] = jeton;
					indexPropositionEnCours++;
				}

				if (doubleClic) {
					if (indexPropositionEnCours > 0) {
						indexPropositionEnCours--;
						propositionEnCours[indexPropositionEnCours] = 0;
					}
				}

				if (indexPropositionEnCours == 4) {
					int[] resultat = corrigerProposition(propositionEnCours, combinaison);
					afficherResultat(resultat);
					nbTentatives--;

					if (resultat[0] == 4) {
						partieGagnee = true;
					}

					indexPropositionEnCours = 0;
				}
			}

			if (partieGagnee) {
				afficherGagne();
			} else {
				afficherPerdu();
			}
		}

	}

	private static void afficherPerdu() {
		// TODO Auto-generated method stub

	}

	private static void afficherGagne() {
		// TODO Auto-generated method stub

	}

	private static void afficherResultat(int[] resultat) {
		// TODO Auto-generated method stub

	}

	private static int[] corrigerProposition(int[] propositionEnCours, int[] combinaison) {
		// TODO Auto-generated method stub
		return null;
	}

	private static int[] choisirCombinaison() {
		// TODO Auto-generated method stub
		return null;
	}
}
