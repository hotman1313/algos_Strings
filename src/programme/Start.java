package programme;

import java.util.Scanner;

import algo_1.Mirroir;
import algo_2.FizzBuzz;
import algo_3.Anagramme;

public class Start {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int choixMenu, limite;
		String entree;
		Anagramme anagramme = new Anagramme();
		Mirroir mirroir = new Mirroir();
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		while (true) {	
			System.out.println("========================");
			System.out.println("|\t\t\t|\n|\tmenu\t\t|\n|\t\t\t|\n|\t\t\t|");
			System.out.println("========================");
			System.out.println("\n1. Exo 1 (Inverser les lettres d'un mot)\n2. Exo 2 (FizzBuzz)\n3. Exo 3 (Anagramme)");
			choixMenu = sc.nextInt();
			
			if(choixMenu == 1) {
				System.out.print("Entrez le mot que vous voulez inverser : ");
				entree = sc.next();
				
				mirroir.setMot(entree);
				
				System.out.println(mirroir.inverser());
				
			}else if (choixMenu == 2) {
				System.out.print("Entrez la limite n : ");
				limite = sc.nextInt();
				
				fizzBuzz.setLimite(limite);
				
				for (String string : fizzBuzz.imprimer()) {
					System.out.println(string);
				}
			}else if (choixMenu == 3) {
				System.out.print("Entrez le premier mot  : ");
				entree = sc.next();
				anagramme.setMot1(entree);
				System.out.print("Entrez le secondmot  : ");
				entree = sc.next();
				anagramme.setMot2(entree);
				
				if(anagramme.sontAnagramme()) 
					System.out.println("Ces deux mots sont un anagramme. ");
				else
					System.out.println("Ces deux mots3 ne sont pas un anagramme. ");
			}else {
				System.out.println("Vous devez choisir dans le menu entre 1 et 3");
			}
			
		}
		
	}

}
