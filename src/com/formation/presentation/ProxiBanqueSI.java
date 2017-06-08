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

		conseillerClientService.creerClient("1 rue trucmuche", 00001, "Lyon", null, "clientNormal");
		conseillerClientService.creerClient("2 rue trucmuche", 00001, "Lyon", null, "clientEntreprise");
		conseillerClientService.creerClient("3 rue trucmuche", 00001, "Lyon", null, "clientFortune");
		conseillerClientService.creerClient("4 rue trucmuche", 00001, "Lyon", null, "clientNormal");
		conseillerClientService.creerClient("5 rue trucmuche", 00001, "Lyon", null, "clientNormal");
		conseillerClientService.creerClient("6 rue trucmuche", 00001, "Lyon", null, "clientNormal");
		conseillerClientService.creerClient("7 rue trucmuche", 00001, "Lyon", null, "clientNormal");
		conseillerClientService.creerClient("8 rue trucmuche", 00001, "Lyon", null, "clientNormal");
		

//		conseillerClientService.getListeClients().remove(3);
		System.out.println(Konrad.getListeClientConseilles().size());

		AffichagePortefeuillePresentation affichage= new AffichagePortefeuillePresentation();
//		affichage.afficherPorteFeuille(Konrad);
		
		conseillerClientService.supprimerClient(3);
		affichage.afficherPorteFeuille(Konrad);


		conseillerClientService.modifInfoClient(3, "McLaughlin", "John", "NewYork", "3 rue perdue");
		System.out.println(conseillerClientService.getInfoClient(3));


		// System.out.println(Konrad.getListeClientConseilles().stream()
		// .collect(Collectors.toList()));
		//
		// test remove

		// // D�clarations
		// int choix;
		// char cont = 'O';
		//
		//
		// Scanner sc = new Scanner(System.in);
		//
		// do {
		// System.out.println("Accueil de ProxiBanqueSI : \n + acces pour : \n1 : Conseiller \n2 : Gerant \n");
		// choix = sc.nextInt();
		// switch (choix) {
		// case 1:
		// System.out.println("Connexion d'un conseiller \n");
		// conseillerPresentation conseillerPresentation =new
		// conseillerPresentation();
		// conseillerPresentation.menuConseiller();
		// break;
		// case 2:
		// System.out.println("Connexion d'un gerant \n");
		//
		// break;
		// }
		// System.out.println(" \n Voulez-vous faire autre chose? Tappez O pour continuer (o majuscule)");
		// cont = sc.next().charAt(0);
		//
		// } while (cont == 'O');
		//
		//
	}
}
