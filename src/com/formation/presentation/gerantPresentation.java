package com.formation.presentation;

import java.util.Scanner;

public class gerantPresentation {

	public void menuGerant(){
		
		int choix;
		Scanner sc = new Scanner(System.in);
		System.out.println("Accueil conseiller\n actions possibles :\n"
				+ "1 : ajouter un nouveau client\n"
				+ "2 : supprimer un client\n"
				+ "3 : modifier les informations d'un client\n"
				+ "4 : effectuer un virement de compte a compte\n"
				+ "5 : faire une simulation de credit\n"
				+ "6 : obtenir laliste des transactions\n"
				+ "7 : faire de la gestion de patrimoine\n"
				+ "8 : faire un audit des clients\n"
				+ "9 : transfere un client chez un autre conseiller\n");
		
		choix = sc.nextInt(); // Demande l'option a salectionner
		System.out.println(choix);
		
		}
}
