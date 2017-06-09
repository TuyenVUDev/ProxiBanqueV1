package com.formation.presentation;

import java.util.Scanner;
import java.util.stream.Collectors;

import com.formation.domaine.Client;
import com.formation.domaine.ClientEntreprise;
import com.formation.domaine.ClientFortune;
import com.formation.domaine.ClientNormal;
import com.formation.domaine.Compte;
import com.formation.domaine.CompteCourant;

import com.formation.domaine.Conseiller;
import com.formation.domaine.Gerant;
import com.formation.domaine.Transaction;
import com.formation.domaine.Transaction;
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
		 null,null, "clientNormal");
		 conseillerClientService.creerClient("toto","tata","2 rue trucmuche", 00001, "Lyon",
		 null,null, "clientEntreprise");
		 conseillerClientService.creerClient("toto","tata","3 rue trucmuche", 00001, "Lyon",
		 null,null, "clientFortune");
		 conseillerClientService.creerClient("toto","tata","4 rue trucmuche", 00001, "Lyon",
		 null,null, "clientNormal");
		 conseillerClientService.creerClient("toto","tata","5 rue trucmuche", 00001, "Lyon",
		 null,null, "clientNormal");
		 conseillerClientService.creerClient("toto","tata","6 rue trucmuche", 00001, "Lyon",
		 null,null, "clientNormal");
		 conseillerClientService.creerClient("toto","tata","7 rue trucmuche", 00001, "Lyon",
		 null,null, "clientNormal");
		 conseillerClientService.creerClient("toto","tata","8 rue trucmuche", 00001, "Lyon",
		 null,null, "clientNormal");

		AffichagePortefeuillePresentation affichage = new AffichagePortefeuillePresentation();
		int choix, index, index2, codePostal,numDeCompte,tel, icompte1,icompte2;
		float solde,montant;
		char cont = 'O';
		String adresse, nom, prenom, ville, typeClient,dateOuverture,typeCompte;
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
						ville, null,null, typeClient);
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
				System.out.println("creation de compte\n");
				System.out.println("solde : \n");
				solde  = sc.nextFloat();
				sc.nextLine();
				System.out.println("numero de compte :\n");
				numDeCompte=sc.nextInt();
				sc.nextLine();
				System.out.println("date d'ouverture : \n");
				dateOuverture=sc.nextLine();
				System.out.println("telephone :\n");
				tel=sc.nextInt();
				sc.nextLine();
				System.out.println("type de compte (compteNormal, compteEpargne) :\n");
				typeCompte=sc.nextLine();
				Compte compteTemporaire;
				compteTemporaire=compteService.creerCompte(solde, numDeCompte, dateOuverture, tel,typeCompte);
				System.out.println("pour le client :\n");
				affichage.afficherPorteFeuille(Konrad);
				index = sc.nextInt();
				sc.nextLine();
				System.out.println("compte 1 ou 2 ? :\n");
				index2=sc.nextInt();
				sc.nextLine();
				compteService.alouerCompteaClient(Konrad.getListeClientConseilles().get(index), compteTemporaire,index2);
				break;
			case 6:
				System.out.println("virement de compte a compte\n");
				affichage.afficherPorteFeuille(Konrad);
				
				System.out.println("quel index client (debiteur)? :\n");
				index=sc.nextInt();
				sc.nextLine();
				Client clientDebite=Konrad.getListeClientConseilles().get(index);
				
				System.out.println("compte 1 ou 2 ?");
				icompte1=sc.nextInt();
				sc.nextLine();
				
				affichage.afficherPorteFeuille(Konrad);
				
				System.out.println("quel index client (crediteur)? :\n");
				index=sc.nextInt();
				sc.nextLine();
				Client clientCredite=Konrad.getListeClientConseilles().get(index);
				
				System.out.println("compte 1 ou 2 ?");
				icompte2=sc.nextInt();
				sc.nextLine();
				
				System.out.println("quel montant ? :\n");
				montant = sc.nextFloat();
				sc.nextLine();
				
				Transaction transaction = null ;
				
				if (icompte1==1&&icompte2==1)
					transaction= new Transaction(clientDebite, montant, clientCredite.getCompte1(), clientDebite.getCompte1());
				else if (icompte1==2&&icompte2==1)
					transaction= new Transaction(clientDebite, montant, clientCredite.getCompte2(), clientDebite.getCompte1());
				else if (icompte1==1&&icompte2==2)
					transaction= new Transaction(clientDebite, montant, clientCredite.getCompte1(), clientDebite.getCompte2());
				else if (icompte1==2&&icompte2==2)
					transaction= new Transaction(clientDebite, montant, clientCredite.getCompte2(), clientDebite.getCompte2());
				compteService.virementCompteACompte(transaction);
				
				break;
			case 7:
				System.out.println("simulation de credit\n"); //ok
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
