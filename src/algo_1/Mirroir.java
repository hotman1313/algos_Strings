package algo_1;

public class Mirroir {

	String mot;
	
	public Mirroir(String mot_) {
		mot = mot_;
	}
	
	public Mirroir(){}
	
	public String inverser() {
		char[] caracteresMot = new char[mot.length()]; //chaine de caractères d'arrivée
		int compteur = mot.length()-1; //indices des caractères du mots de départ
		for (int i = 0; i < mot.length(); i++) {//chaque caractère du mot inital
			caracteresMot[i] = mot.charAt(compteur);//parcourt des caractères du dernier au premier
			compteur--;
		}	
		
		//mot inversé
		return new String(caracteresMot);
	}

	public String getMot() {
		return mot;
	}

	public void setMot(String mot) {
		this.mot = mot;
	}
	
	
}
