package com.formation.presentation;

import java.util.Scanner;
import java.util.stream.Collectors;

import com.formation.domaine.Client;
import com.formation.domaine.ClientEntreprise;
import com.formation.domaine.ClientFortune;
import com.formation.domaine.ClientNormal;
import com.formation.domaine.Conseiller;
import com.formation.domaine.Gerant;
import com.formation.service.CompteService;
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
		CompteService compteService= new CompteService(Konrad);
		
		 conseillerClientService.creerClient("toto","tata","1 rue trucmuche", 00001, "Lyon",
		 null, "clientNormal");
		 conseillerClientService.creerClient("toto","tata","2 rue trucmuche", 00001, "Lyon",
		 null, "clientEntreprise");
		 conseillerClientService.creerClient("toto","tata","3 rue trucmuche", 00001, "Lyon",
		 null, "clientFortune");
		 conseillerClientService.creerClient("toto","tata","4 rue trucmuche", 00001, "Lyon",
		 null, "clientNormal");
		 conseillerClientService.creerClient("toto","tata","5 rue trucmuche", 00001, "Lyon",
		 null, "clientNormal");
		 conseillerClientService.creerClient("toto","tata","6 rue trucmuche", 00001, "Lyon",
		 null, "clientNormal");
		 conseillerClientService.creerClient("toto","tata","7 rue trucmuche", 00001, "Lyon",
		 null, "clientNormal");
		 conseillerClientService.creerClient("toto","tata","8 rue trucmuche", 00001, "Lyon",
		 null, "clientNormal");

		AffichagePortefeuillePresentation affichage = new AffichagePortefeuillePresentation();


		// // Dï¿½clarations
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
					+ "2 : obtenir la liste des clients de votre portefeuille\n"
					+ "3 : supprimer un client\n"
					+ "4 : modifier les informations d'un client\n"
					+ "5 : créer un compte\n"
					+ "6 : effectuer un virement de compte ï¿½ compte\n"
					+ "7 : faire une simulation de credit\n"
					+ "8 : obtenir laliste des transactions\n"
					+ "9 : faire de la gestion de patrimoine\n"
					+ "10 : faire un audit des clients");
			choix = sc.nextInt(); // Demande l'option ï¿½ sï¿½lectionner
			sc.nextLine();
			switch (choix) {
			case 1:
				
				//creation client
				System.out.println("nom :");
				nom = sc.nextLine();
				System.out.println("prenom :");
				prenom = sc.nextLine();
				System.out.println("adresse :");
				adresse = sc.nextLine();
				System.out.println("code postal :");
				codePostal = sc.nextInt();
				ville = sc.nextLine();
				System.out.println("ville :");
				ville = sc.nextLine();
				System.out.println("typeClient (clientNormal, clientFortune, clientEntreprise) :");
				typeClient = sc.nextLine();
				conseillerClientService.creerClient(nom, prenom,adresse,codePostal,
						ville, null, typeClient);
				break;
			case 2 : System.out.println("liste des clients\n");
				affichage.afficherPorteFeuille(Konrad);
				break;
			case 3:
				System.out.println("suppression d'un client\n");
				affichage.afficherPorteFeuille(Konrad);
				System.out.println("Quel client supprimer ? Entrer l'index");
				index = sc.nextInt();
				sc.nextLine();
				conseillerClientService.supprimerClient(index);
				break;
			case 4:
				System.out
						.println("modification des informations d'un client\n");
				System.out.println("choisir l'index client : \n");
				affichage.afficherPorteFeuille(Konrad);
				index = sc.nextInt();
				sc.nextLine();
				System.out.println("nom :");
				nom = sc.nextLine();
				System.out.println("prenom :");
				prenom = sc.nextLine();
				System.out.println("adresse :");
				adresse = sc.nextLine();
				System.out.println("code postal :");
				codePostal = sc.nextInt();
				ville = sc.nextLine();
				System.out.println("ville :");
				ville = sc.nextLine();
				conseillerClientService.modifInfoClient(index, nom, prenom, ville, adresse, codePostal);
				break;
			case 5:
				System.out.println("creation de comtpe\n");
				System.out.println(compteService.creerCompte(1000, 200001, "01/020/03", 123 , "compteNormal"));
				
				break;
			case 6:
				System.out.println("virement de compte a compte\n");
				break;
			case 7:
				System.out.println("simulation de credit\n");
				break;
			case 8:
				System.out.println("gestion de patrimoine)");
				break;
			case 9:
				System.out.println("audit des clients");
				break;
			}
			System.out
					.println(" \n Voulez-vous faire autre chose? Tappez O pour continuer (o majuscule)");
			cont = sc.next().charAt(0);

		} while (cont == 'O');

	}
}
