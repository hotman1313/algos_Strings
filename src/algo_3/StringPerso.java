package algo_3;

import java.util.ArrayList;
import java.util.List;

public class StringPerso {

	//mot composé d'une liste de lettres
	List<Lettre> mot;
	
	public StringPerso(String mot_) {
		this.mot = new ArrayList<>();
		
		//initialisation du mot
		for (Character c : mot_.toCharArray()) {
			this.mot.add(new Lettre(c));
		}
	}
	
	//nb lettres d'un mot (à la main)
	public int length() {
		int nbLettre = 0;
		
		for (Lettre c : mot) {
			nbLettre++;
		}
		
		return nbLettre;
	}
	
	
}
