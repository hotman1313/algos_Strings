package algo_3;

public class Lettre {
	
	//le caractère de base
	Character c;
	
	//sert dans la liste de Lettre composant le mot
	boolean traitee;
	
	public Lettre(Character c_) {
		c = new Character(c_);
		traitee = false;
	}
}
