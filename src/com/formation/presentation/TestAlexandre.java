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
import com.formation.service.CompteService;
import com.formation.service.ConseillerService;

public class TestAlexandre {

	public static void main(String[] args) {

		//Declaration pour test
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
		
		System.out.println(Clyde);
		System.out.println(Claude);
		
		Compte premiercompte = new CompteCourant();
		Compte secondcompte = new CompteCourant();

		premiercompte.setSolde(50000);
		premiercompte.setNumDeCompte(30000);
		premiercompte.setDateOuverture("En mai");
		premiercompte.setTel(060000000);
		
		secondcompte.setSolde(30000);
		secondcompte.setNumDeCompte(40000);
		secondcompte.setDateOuverture("En juin");
		secondcompte.setTel(060000100);
		
		Clyde.setCompte(premiercompte);
		Claude.setCompte(secondcompte);

		/*Clyde.getCompte().setNumDeCompte(30000);
		Clyde.getCompte().setDateOuverture("En mai");
		Clyde.getCompte().setTel(060000000);
		Claude.getCompte().setSolde(30000);
		Claude.getCompte().setNumDeCompte(30050);
		Claude.getCompte().setDateOuverture("En juin");
		Claude.getCompte().setTel(060000005); */
		System.out.println("=========COMPTES AVANT TRANSACTION========");

		System.out.println(Clyde);
		System.out.println("Compte de Clyde : " + premiercompte); // La méthode toString du compte est à refaire

		System.out.println(Claude);
		System.out.println("Compte de Claude : " + secondcompte);
		Transaction testtransat = new Transaction(Clyde, 10000,premiercompte, secondcompte); //public Transaction(Client client, float montant, Compte compteCredite, Compte compteDebite) {
		
		System.out.println("Transaction :  " + testtransat);

		
		CompteService.virementCompteACompte(testtransat);
		System.out.println("=========COMPTES APRES TRANSACTION========");
		System.out.println("Compte de Clyde : " + premiercompte); // La méthode toString du compte est à refaire
		System.out.println("Compte de Claude : " + secondcompte); //Les chiffres coincident

		
		/*
		ConseillerService conseillerService = new ConseillerService(Konrad);
		
		//test creation de client
		System.out.println(conseillerService.creerClient("1 rue trucmuche", 00001, "Lyon", null, "clientNormal"));
		System.out.println(conseillerService.creerClient("2 rue trucmuche", 00001, "Lyon", null, "clientEntreprise"));
		System.out.println(conseillerService.creerClient("3 rue trucmuche", 00001, "Lyon", null, "clientEntreprise"));
		System.out.println(conseillerService.creerClient("4 rue trucmuche", 00001, "Lyon", null, "clientEntreprise"));
		System.out.println(conseillerService.creerClient("5 rue trucmuche", 00001, "Lyon", null, "clientEntreprise"));
		System.out.println(conseillerService.creerClient("6 rue trucmuche", 00001, "Lyon", null, "clientEntreprise"));
		System.out.println(conseillerService.creerClient("7 rue trucmuche", 00001, "Lyon", null, "clientEntreprise"));
		System.out.println(conseillerService.creerClient("8 rue trucmuche", 00001, "Lyon", null, "clientEntreprise"));
		System.out.println(Konrad.getListeClientConseilles());

		for (Client client : Konrad.getListeClientConseilles()){
			System.out.println(Konrad.getListeClientConseilles().indexOf(client) 
					+ " : " + client.getAdresse() + " " 
					+ client.getPrenom());
		}
//		System.out.println(Konrad.getListeClientConseilles().stream()
//				.collect(Collectors.toList()));
//		*/
		//test remove
		
//		// D�clarations
//		int choix;
//		char cont = 'O';
//		
//
//		Scanner sc = new Scanner(System.in);
//		
//		do {
//		System.out.println("Accueil de ProxiBanqueSI : \n + acces pour : \n1 : Conseiller \n2 : Gerant \n");
//		choix = sc.nextInt(); 
//			switch (choix) {
//			case 1:
//				System.out.println("Connexion d'un conseiller \n");
//				conseillerPresentation conseillerPresentation =new conseillerPresentation();
//				conseillerPresentation.menuConseiller();
//				break;
//			case 2:
//				System.out.println("Connexion d'un gerant \n");
//				
//				break;
//			}
//				System.out.println(" \n Voulez-vous faire autre chose? Tappez O pour continuer (o majuscule)");
//				cont = sc.next().charAt(0);	
//			
//			} while (cont == 'O');
//			
//
		}
	}

