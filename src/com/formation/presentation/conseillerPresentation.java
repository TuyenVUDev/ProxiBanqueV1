package com.formation.presentation;

import java.util.Scanner;

import com.formation.domaine.Conseiller;
import com.formation.service.conseillerClientService;

public class conseillerPresentation {
	Conseiller conseiller;
	conseillerClientService conseillerClientService = new conseillerClientService(conseiller);

	public void menuConseiller() {
		char cont = 'O';

		int choix;
		Scanner sc = new Scanner(System.in);
		System.out.println("Accueil conseiller\n actions possibles :\n" 
				+ "1 : ajouter un nouveau client\n"
				+ "2 : supprimer un client\n" 
				+ "3 : modifier les informations d'un client\n"
				+ "4 : effectuer un virement de compte � compte\n" 
				+ "5 : faire une simulation de credit\n"
				+ "6 : obtenir laliste des transactions\n" 
				+ "7 : faire de la gestion de patrimoine\n"
				+ "8 : faire un audit des clients");
		choix = sc.nextInt(); // Demande l'option � s�lectionner
		do {
			switch (choix) {
			case 1:
				System.out.println("ajout d'un nouveau client \n");

				conseillerClientService.creerClient("1 rue trucmuche", 00001, "Lyon", null, "clientNormal");
				conseillerClientService.creerClient("2 rue trucmuche", 00001, "Lyon", null, "clientEntreprise");
				conseillerClientService.creerClient("3 rue trucmuche", 00001, "Lyon", null, "clientFortune");
				conseillerClientService.creerClient("4 rue trucmuche", 00001, "Lyon", null, "clientNormal");
				conseillerClientService.creerClient("5 rue trucmuche", 00001, "Lyon", null, "clientNormal");
				conseillerClientService.creerClient("6 rue trucmuche", 00001, "Lyon", null, "clientNormal");
				conseillerClientService.creerClient("7 rue trucmuche", 00001, "Lyon", null, "clientNormal");
				conseillerClientService.creerClient("8 rue trucmuche", 00001, "Lyon", null, "clientNormal");
				
				break;
			case 2:
				System.out.println("suppression d'un client\n");
				break;
			case 3:
				System.out.println("modification des informations d'un client\n");
				break;
			case 4:
				System.out.println("virement de compte � compte\n");
				break;
			case 5:
				System.out.println("simulation de credit\n");
				break;
			case 7:
				System.out.println("gestion de patrimoine)");
				break;
			case 8:
				System.out.println("audit des clients");
				break;
			}
			
				System.out.println(" \n Voulez-vous faire autre chose? Tappez O pour continuer (o majuscule)");
				cont = sc.next().charAt(0);	
		
		choix = sc.nextInt(); // Demande l'option � s�lectionner
		} while (cont == 'O');

	}

	/**
	 * 
	 */
	public conseillerPresentation(Conseiller conseiller) {
		super();
		// TODO Auto-generated constructor stub
	}

}
