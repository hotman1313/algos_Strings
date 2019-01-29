package algo_3;

public class Anagramme {

	StringPerso mot1;
	
	StringPerso mot2;

	String mot2Str;
	
	public Anagramme(String mot1_, String mot2_) {
		mot1 = new StringPerso(mot1_);
		mot2 = new StringPerso(mot2_);
		mot2Str = mot2_;
	}
	
	public Anagramme() {}
	
	public boolean sontAnagramme() {
		boolean continuer = true;
		
		if(mot1.length() == mot2.length()) { //même taille
			for (Lettre l : mot1.mot) { //pour chaque lettre du premier
				for (Lettre l2 : mot2.mot) {//parcourt des lettres du second
					if (!l2.traitee) {//si elle n'a pas encore été "couplée" avec une lettre du premier
						if(l.c.charValue() == l2.c.charValue()) { //couplage possible
							l2.traitee = true; //cette lettre est couplée
							break;
						}
					}
				}
			}
		}else
			return false;

		//si toutes les lettres sont couplées, retourne vrai, sinon faux
		for (Lettre l : mot2.mot) {
			if(l.traitee)
				continuer = true;
			else
				return false;
		}
		
		return continuer;
	}

	public StringPerso getMot1() {
		return mot1;
	}

	public void setMot1(String mot1) {
		this.mot1 = new StringPerso(mot1);
	}

	public StringPerso getMot2() {
		return mot2;
	}

	public void setMot2(String mot2) {
		this.mot2 = new StringPerso(mot2);
	}
	
	
}
