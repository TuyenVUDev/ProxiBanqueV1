package com.formation.presentation;

import java.util.Scanner;

import com.formation.domaine.Client;
import com.formation.domaine.ClientEntreprise;
import com.formation.domaine.ClientFortune;
import com.formation.domaine.ClientNormal;
import com.formation.domaine.Conseiller;
import com.formation.domaine.Gerant;

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

		// D�clarations
		int choix;
		char cont = 'O';

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Accueil de ProxiBanqueSI : \n + acces pour : \n1 : Conseiller \n2 : Gerant \n");
			choix = sc.nextInt();
			switch (choix) {
			case 1:
				System.out.println("Connexion d'un conseiller \n");
				conseillerPresentation conseillerPresentation = new conseillerPresentation();
				conseillerPresentation.menuConseiller();
				break;
			case 2:
				System.out.println("Connexion d'un gerant \n");

				break;
			}
			System.out.println(" \n Voulez-vous faire autre chose? Tappez O pour continuer (o majuscule)");
			cont = sc.next().charAt(0);

		} while (cont == 'O');

	}
}
