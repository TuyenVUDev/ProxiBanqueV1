package com.formation.presentation;

import java.util.Scanner;
import java.util.stream.Collectors;

import com.formation.domaine.Client;
import com.formation.domaine.ClientEntreprise;
import com.formation.domaine.ClientFortune;
import com.formation.domaine.ClientNormal;
import com.formation.domaine.Conseiller;
import com.formation.domaine.Gerant;
import com.formation.service.ConseillerService;
import com.formation.service.conseillerClientService;

public class ProxiBanqueSI {

	public static void main(String[] args) {

		// Declaration pour test
		Gerant Gerard = new Gerant();
		Gerard.setNom("Majax");
		Gerard.setPrenom("Gerard");
		Conseiller Konrad = new Conseiller();
		Konrad.setNom("Adenauer");
		Konrad.setPrenom("Konrad");
		Conseiller Kasparov = new Conseiller();
		Kasparov.setNom("Kasparov");
		Kasparov.setPrenom("Gari");
		Client Claude = new ClientNormal();
		Claude.setNom("Chabrol");
		Claude.setPrenom("Claude");
		Client ClimIndustrielle = new ClientEntreprise();
		Client Clyde = new ClientFortune();
		Clyde.setNom("Barrow");
		Clyde.setPrenom("Clyde");

		conseillerClientService conseillerClientService = new conseillerClientService(
				Konrad);
		// test creation de client
		// System.out.println(Konrad.getListeClientConseilles().size());
		// //ERREUR

		// conseillerClientService.creerClient("1 rue trucmuche", 00001, "Lyon",
		// null, "clientNormal");
		// conseillerClientService.creerClient("2 rue trucmuche", 00001, "Lyon",
		// null, "clientEntreprise");
		// conseillerClientService.creerClient("3 rue trucmuche", 00001, "Lyon",
		// null, "clientFortune");
		// conseillerClientService.creerClient("4 rue trucmuche", 00001, "Lyon",
		// null, "clientNormal");
		// conseillerClientService.creerClient("5 rue trucmuche", 00001, "Lyon",
		// null, "clientNormal");
		// conseillerClientService.creerClient("6 rue trucmuche", 00001, "Lyon",
		// null, "clientNormal");
		// conseillerClientService.creerClient("7 rue trucmuche", 00001, "Lyon",
		// null, "clientNormal");
		// conseillerClientService.creerClient("8 rue trucmuche", 00001, "Lyon",
		// null, "clientNormal");

		AffichagePortefeuillePresentation affichage = new AffichagePortefeuillePresentation();

		// conseillerClientService.supprimerClient(3);

		// conseillerClientService.modifInfoClient(3, "McLaughlin", "John",
		// "NewYork", "3 rue perdue");
		// System.out.println(conseillerClientService.getInfoClient(3));
		// affichage.afficherPorteFeuille(Konrad);

		// System.out.println(Konrad.getListeClientConseilles().stream()
		// .collect(Collectors.toList()));
		//
		// test remove

		// // D�clarations
		int choix, index, codePostal;
		char cont = 'O';
		String adresse, nom, prenom, ville, typeClient;
		Scanner sc = new Scanner(System.in);
		//
		// System.out
		// .println("Accueil de ProxiBanqueSI : \n  acces pour : \n1 : Conseiller \n2 : Gerant \n");
		// choix = sc.nextInt();
		// switch (choix) {
		// case 1:
		// System.out.println("Connexion d'un conseiller \n");
		// break;
		// case 2:
		// System.out.println("Connexion d'un gerant \n");
		//
		// break;
		// }

		do {
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

			switch (choix) {
			case 1:
				System.out.println("nom :");
				nom = sc.nextLine();
//				System.out.println("prenom :");
//				prenom = sc.nextLine();
//				System.out.println("adresse :");
//				adresse = sc.nextLine();
//				System.out.println("code postal :");
//				codePostal = sc.nextInt();
//				System.out.println("ville :");
//				ville = sc.nextLine();
//				System.out.println("typeClient (clientNormal, clientFortune, clientEntreprise) :");
//				typeClient = sc.nextLine();
//				conseillerClientService.creerClient(adresse,codePostal,
//						ville, null, typeClient);
				break;
			case 2:
				System.out.println("suppression d'un client\n");
				affichage.afficherPorteFeuille(Konrad);
				System.out.println("Quel client supprimer ? Entrer l'index");
				index = sc.nextInt();
				conseillerClientService.supprimerClient(index);
				break;
			case 3:
				System.out
						.println("modification des informations d'un client\n");
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
			System.out
					.println(" \n Voulez-vous faire autre chose? Tappez O pour continuer (o majuscule)");
			cont = sc.next().charAt(0);

		} while (cont == 'O');

	}
}
