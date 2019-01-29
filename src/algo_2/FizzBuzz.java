package algo_2;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
	int limite;
	
	public FizzBuzz(int n) {
		limite = n;
	}
	
	public FizzBuzz() {}
	
	public List<String> imprimer(){
		
		//liste d'arrivée
		List<String> listeStrFizzBuzz = new ArrayList<>();
		
		//compteur jusqu'à n
		int compteur = 1;
		
		//jusqu'à n
		while (compteur <= limite) {
			if((compteur%5) == 0 && (compteur%3) == 0)
				listeStrFizzBuzz.add(new String("FizzBuzz"));
			else if((compteur%3) == 0)
				listeStrFizzBuzz.add(new String("Fizz"));
			else if((compteur%5) == 0)
				listeStrFizzBuzz.add(new String("Buzz"));
			else {
				listeStrFizzBuzz.add(new String(Integer.toString(compteur)));
			}
			compteur++;
		}
		
		return listeStrFizzBuzz;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

}
