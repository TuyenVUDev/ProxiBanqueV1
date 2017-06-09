package com.formation.presentation;

import java.util.Scanner;
import java.util.stream.Collectors;

import com.formation.domaine.Client;
import com.formation.domaine.ClientEntreprise;
import com.formation.domaine.ClientFortune;
import com.formation.domaine.ClientNormal;
import com.formation.domaine.Compte;
import com.formation.domaine.Credit;
import com.formation.domaine.Conseiller;
import com.formation.domaine.Gerant;
import com.formation.domaine.Transaction;
import com.formation.service.CompteService;
import com.formation.service.conseillerClientService;


/**
 * 
 * @author tuyen
 *

 *         
 */
public class ProxiBanqueSI {
	/**
	 *         Classe contenant la methode principale, 
	 *         non terminee
	 *         Les fonctionnalites sont pour l'instant pour un unique conseiller
	 *         Modification a faire : implementer les autres classes presentation pour alleger la methode main
	 *         
	 */         
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

		conseillerClientService conseillerClientService = new conseillerClientService(Konrad);
		CompteService compteService = new CompteService(Konrad);


		AffichagePortefeuillePresentation affichage = new AffichagePortefeuillePresentation();
		int choix, index, index2, codePostal, numDeCompte, tel, icompte1, icompte2, duree, mensualites;
		float solde, montant, taux, interets;
		char cont = 'O';
		String adresse, nom, prenom, ville, typeClient, dateOuverture, typeCompte;
		Scanner sc = new Scanner(System.in);



		do {
			System.out.println("Accueil conseiller\n actions possibles :\n" + "1 : ajouter un nouveau client\n"
					+ "2 : obtenir la liste des clients de votre portefeuille\n" + "3 : supprimer un client\n"
					+ "4 : modifier les informations d'un client\n" + "5 : creer un compte\n"
					+ "6 : effectuer un virement de compte a compte\n" + "7 : faire une simulation de credit\n"
					+ "8 : obtenir laliste des transactions\n" + "9 : faire de la gestion de patrimoine\n"
					+ "10 : faire un audit des clients");
			choix = sc.nextInt(); 
			sc.nextLine();
			switch (choix) {

			case 1:
				System.out.println("creation de client \n");
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
				conseillerClientService.creerClient(nom, prenom, adresse, codePostal, ville, null, null, typeClient);
				break;

			case 2:
				System.out.println("liste des clients\n");
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
				System.out.println("modification des informations d'un client\n");
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
				solde = sc.nextFloat();
				sc.nextLine();
				System.out.println("numero de compte :\n");
				numDeCompte = sc.nextInt();
				sc.nextLine();
				System.out.println("date d'ouverture : \n");
				dateOuverture = sc.nextLine();
				System.out.println("telephone :\n");
				tel = sc.nextInt();
				sc.nextLine();
				System.out.println("type de compte (compteNormal, compteEpargne) :\n");
				typeCompte = sc.nextLine();
				Compte compteTemporaire;
				compteTemporaire = compteService.creerCompte(solde, numDeCompte, dateOuverture, tel, typeCompte);
				System.out.println("pour le client :\n");
				affichage.afficherPorteFeuille(Konrad);
				index = sc.nextInt();
				sc.nextLine();
				System.out.println("compte 1 ou 2 ? :\n");
				index2 = sc.nextInt();
				sc.nextLine();
				compteService.alouerCompteaClient(Konrad.getListeClientConseilles().get(index), compteTemporaire,
						index2);
				break;

			case 6:
				System.out.println("virement de compte a compte\n");
				affichage.afficherPorteFeuille(Konrad);

				System.out.println("quel index client (debiteur)? :\n");
				index = sc.nextInt();
				sc.nextLine();
				Client clientDebite = Konrad.getListeClientConseilles().get(index);

				System.out.println("compte 1 ou 2 ?");
				icompte1 = sc.nextInt();
				sc.nextLine();

				affichage.afficherPorteFeuille(Konrad);

				System.out.println("quel index client (crediteur)? :\n");
				index = sc.nextInt();
				sc.nextLine();
				Client clientCredite = Konrad.getListeClientConseilles().get(index);

				System.out.println("compte 1 ou 2 ?");
				icompte2 = sc.nextInt();
				sc.nextLine();

				System.out.println("quel montant ? :\n");
				montant = sc.nextFloat();
				sc.nextLine();

				Transaction transaction = null;

				if (icompte1 == 1 && icompte2 == 1)
					transaction = new Transaction(clientDebite, montant, clientCredite.getCompte1(),
							clientDebite.getCompte1());
				else if (icompte1 == 2 && icompte2 == 1)
					transaction = new Transaction(clientDebite, montant, clientCredite.getCompte2(),
							clientDebite.getCompte1());
				else if (icompte1 == 1 && icompte2 == 2)
					transaction = new Transaction(clientDebite, montant, clientCredite.getCompte1(),
							clientDebite.getCompte2());
				else if (icompte1 == 2 && icompte2 == 2)
					transaction = new Transaction(clientDebite, montant, clientCredite.getCompte2(),
							clientDebite.getCompte2());
				compteService.virementCompteACompte(transaction);

				break;

			case 7:
				System.out.println("simulation de credit\n"); // ok
				Credit credit = null;
				affichage.afficherPorteFeuille(Konrad);

				System.out.println("pour quel index client :\n");
				index = sc.nextInt();
				sc.nextLine();
				Client client = Konrad.getListeClientConseilles().get(index);

				System.out.println("quel taux ? :\n");
				taux = sc.nextFloat();
				sc.nextLine();

				System.out.println("quelle duree (en mois) ?");
				duree = sc.nextInt();
				sc.nextLine();

				System.out.println("montant maximum de mensualites ? :\n");
				mensualites = sc.nextInt();
				sc.nextLine();

				System.out.println("quel montant ? :\n");
				montant = sc.nextFloat();
				sc.nextLine();

				credit = new Credit(client, taux, duree, mensualites, montant);
				interets = compteService.simulationCredit(credit);
				System.out.println("les interets sont de " + interets + "\n");
				break;

			case 8:
				System.out.println("gestion de patrimoine) -- NON IMPLEMENTE ");
				break;

			case 9:

				System.out.println("audit des clients \n");
				System.out.println("les clients normaux dont le solde est inferieur au decouvert : \n");
				System.out.println(Konrad.getListeClientConseilles().stream()
						.filter(c -> c.getTypeClient() == "clientNormal")
						.filter(c -> c.getCompte1().getSolde()< -1000)
						.map(c -> c.getNom())
						.collect(Collectors.toList()));

				break;
			}
			System.out.println(" \n Voulez-vous faire autre chose? Tappez O pour continuer (o majuscule)");
			cont = sc.next().charAt(0);

		} while (cont == 'O');

	}
}
