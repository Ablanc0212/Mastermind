import java.awt.Color;
import java.util.ArrayList;

public class Rangée extends Modèle {
	ArrayList<Color>Rangée;
	int indiceJeton;
	int noirs;
	int blancs;

	public Rangée(int taille) {
		
		indiceJeton = 0;
		noirs = 0;
		blancs = 0;
	}
}
