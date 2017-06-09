package com.formation.service;

import java.util.ArrayList;
import java.util.Collection;

import com.formation.domaine.Client;
import com.formation.domaine.ClientEntreprise;
import com.formation.domaine.ClientFortune;
import com.formation.domaine.ClientNormal;
import com.formation.domaine.Compte;
import com.formation.domaine.CompteCourant;
import com.formation.domaine.ComptePlacement;
import com.formation.domaine.CompteEpargne;
import com.formation.domaine.CompteFortune;
import com.formation.domaine.Conseiller;
import com.formation.domaine.Credit;
import com.formation.domaine.Transaction;
import java.util.Random;

/**
 * 
 * @author alex
 *
 *         CompteService est la classe comptenant les méthodes de manipulations
 *         des comptes, creations, modifications, virements, placements ect.
 */

public class CompteService {

	/**
	 * 
	 *
	 *
	 * CompteService est la classe comptenant les methodes de manipulations des
	 * comptes, creations, modifications, virements, placements ect. Le solde du
	 * compte en paramètre permet de rediriger le type de Compte d'interet.
	 *
	 * Rentrer en parametre dans ce ordre le solde du compte à creer, une date
	 * d'ouverture (String), un telephone (int), et le type de compte, SOIT
	 * "compteNormal" SOIT "compteEpargne"
	 *
	 * @return soit un null lorsque le compte n'est pas crée, soit une sous classe
	 *         de Compte, qui est soit de type CompteFortune, CompteCourant,
	 *         CompteEpargne
	 */

	public Compte creerCompte(float solde, int numDeCompte, String dateOuverture, int tel, String typeCompte) {
		if (typeCompte.equals("compteNormal")) {

			if (solde > 500000) {
				CompteFortune nouveauPlacement = new CompteFortune(solde, numDeCompte, dateOuverture, tel);
				return nouveauPlacement;
			}

			else if (solde < 500000) {
				CompteCourant nouveauCourant = new CompteCourant(solde, numDeCompte, dateOuverture, tel);
				return nouveauCourant;
			}
		}

		else if (typeCompte.equals("compteEpargne")) {
			CompteEpargne nouveauEpargne = new CompteEpargne(solde, numDeCompte, dateOuverture, tel);

			return nouveauEpargne;
		} else
			return null;
		return null;

	}// Renvoie false si aucun client n'a ete ceee

	/**
	 * Classe liant une instance du compte a une instance de client
	 * 
	 * @param client
	 *            le client auquel le compte sera lie
	 * @param compte
	 *            le compte qui sera lie au client
	 */

	public void alouerCompteaClient(Client client, Compte compte, int compte1ou2) {
		if (compte1ou2 == 1)
			client.setCompte1(compte);
		else
			client.setCompte2(compte);

	}

<<<<<<< HEAD
	public float virementCompteACompte(Transaction transaction) { // Fait le virement d'un compte � l'autre.
=======
	/**
	 * Utilise une Transaction en parametre et fait un virement La methode fait un
	 * test pour verifier si le compte du debiteur sera sous le plafond de
	 * decourvert apres la transaction, si le solde est trop bas, la transaction est
	 * annulee
	 * 
	 * @param transaction
	 *            Se referer a la classe transaction
	 * @return Le montant de la transaction, pour de futures utilisations, return 0
	 *         si pas de transaction
	 */

	public static float virementCompteACompte(Transaction transaction) { // Fait le virement d'un compte � l'autre.
>>>>>>> 90d681e38d50798b36f5039376846db4bcba7e54
		float finalCompteDebite = transaction.getCompteDebite().getSolde() - transaction.getMontant();
		float finalCompteCredite = transaction.getCompteCredite().getSolde() + transaction.getMontant();
		if (finalCompteDebite > -1000) {
			transaction.getCompteDebite().setSolde(finalCompteDebite); // Fixe le solde du compte
			transaction.getCompteCredite().setSolde(finalCompteCredite); // Fixe le solde du compte

			return transaction.getMontant(); // Retourne le montant de la transaction
		} else
			return 0;
	}

	/**
	 * Methode permettant de faire un placement a un client qui a beaucoup d'argent
	 * sur son compte, >500 000 Le solde du client est verifie et si superieur a la
	 * limite, peut faire un placement Si un placement est fait, un compte de type
	 * ComptePlacement est cree, avec un numero de compte et de telephone aleatoire,
	 * car ils sont a l etrangers Lorsque le compte receveur du montant est cree, la
	 * methode virementCompteACompte est utilise pour faire le transfert d'argent
	 * 
	 * @param clientFortune
	 *            un client heritant de client rentre
	 * @param montantPlacement
	 *            Le montant du placement a faire
	 * @param ville
	 *            la ville ou le placement sera fait, sert à creer le compte servant
	 *            au placement
	 */
	
	
	public void gererPatrimoine(Client clientFortune, float montantPlacement, String ville) {
		if (clientFortune.getCompte1().getSolde() > 500000) {
			Transaction virementriche; // Parametres gererPatrimoine changés par rapport au UML
			Random randomGenerator = new Random();
			int randNumCompte = randomGenerator.nextInt(1000000000); // genere un numero de compte aleatoire pour //
																		// l'étranger
			int randNumTel = randomGenerator.nextInt(1000000000); // NumeroTel aleatoire
			ComptePlacement nouveauEpargne = new ComptePlacement(0, randNumCompte, "Moi de juin", randNumTel, ville);
			virementriche = new Transaction(clientFortune, montantPlacement, clientFortune.getCompte1(), nouveauEpargne);
			virementCompteACompte(virementriche);
		} else {
		}
	}

	/*public void gererPatrimoine(Client clientFortune, float montantPlacement, Bourse villeDePlacement,
			Compte comptenormal, ComptePlacement comptebourse) {
		Transaction virementriche; // Parametres gererPatrimoine chang�s par rapport au UML
		virementriche = new Transaction(clientFortune, montantPlacement, comptenormal, comptebourse);
		virementCompteACompte(virementriche);
	}

	// public void gererPatrimoine2(Client clientFortune, float montantPlacement,
	// String ville) {
	// if (clientFortune.getCompte().getSolde()> 500000) {
	// Transaction virementriche; // Parametres gererPatrimoine chang�s par rapport
	// au UML
	//
	// virementriche = new Transaction(clientFortune, montantPlacement,
	// clientFortune.getCompte(), comptebourse);
	// virementCompteACompte(virementriche);}
	// else {}
	// }
*/
	/**
	 * 
	 * Methode calculant le cout du credit pour une duree donnee, un montant donne
	 * et un taux
	 * 
	 * 
	 * @param credit
	 *            Se reporte a la classe credit
	 * @return le motnant des interets que coutera le credit
	 */

	public static float simulationCredit(Credit credit) {

		float interets = (credit.getMontant() * credit.getTaux() * credit.getDureeEnMois()) / 12000; // Fait le calcul
																										// d'interets

		return interets;
	}

	/**
	 * 
	 * @param client
	 *            Le client qui vera son compte modifie
	 * @param dateOuverture
	 *            Rentrer un string
	 * @param tel
	 *            rentrer un Int
	 *      @param compte1ou2 rentrer 1 pour changer le comptecourant, 2 le compte epargne
	 */

	public void modifCompte(Client client, String dateOuverture, int tel, int compte1ou2) {
		if( compte1ou2 == 1) {
		client.getCompte1().setDateOuverture(dateOuverture);
		client.getCompte1().setTel(tel);}
		if( compte1ou2 == 2) {
			client.getCompte2().setDateOuverture(dateOuverture);
			client.getCompte2().setTel(tel);}
		
	}

}
