package com.formation.service;

import java.util.ArrayList;
import java.util.Collection;

import com.formation.domaine.Bourse;
import com.formation.domaine.Client;
import com.formation.domaine.ClientEntreprise;
import com.formation.domaine.ClientFortune;
import com.formation.domaine.ClientNormal;
import com.formation.domaine.Compte;
import com.formation.domaine.CompteCourant;
import com.formation.domaine.ComptePlacement;
import com.formation.domaine.CompteEpargne;
import com.formation.domaine.Conseiller;
import com.formation.domaine.Credit;
import com.formation.domaine.Transaction;

public class CompteService {

	private Conseiller conseiller;
	ArrayList<Client> listeClients = new ArrayList<Client>();

	public CompteService(Conseiller conseiller) {
		super();
		this.conseiller = conseiller;
	}

	public boolean creerCompte(float solde, int numDeCompte, String dateOuverture, int tel, String typeCompte) {
		if (typeCompte.equals("compteNormal")) {

			if (solde > 500000) {
				ComptePlacement nouveauPlacement = new ComptePlacement(solde, numDeCompte, dateOuverture, tel);
				return true;
			}

			else if (solde < 500000) {
				CompteCourant nouveauCourant = new CompteCourant(solde, numDeCompte, dateOuverture, tel);
				return true;
			}
		}

		else if (typeCompte.equals("compteEpargne")) {
			CompteEpargne nouveauEpargne = new CompteEpargne(solde, numDeCompte, dateOuverture, tel);

			return true;
		} else
			return false;
		return false;
	}// Renvoie false si aucun client n'a été crée

	public void alouerCompteaClient(Client client, Compte compte) {
		client.setCompte(compte);

	}

	public static float virementCompteACompte(Transaction transaction) { // Fait le virement d'un compte à l'autre.
		float finalCompteDebite = transaction.getCompteDebite().getSolde() - transaction.getMontant(); // Credit du
																										// compte débité
																										// après
																										// opération
		float finalCompteCredite = transaction.getCompteCredite().getSolde() + transaction.getMontant(); // Credit du
																											// compte
																											// crédité
																											// après
																											// opération
		transaction.getCompteDebite().setSolde(finalCompteDebite); // Fixe le solde du compte
		transaction.getCompteCredite().setSolde(finalCompteCredite); // Fixe le solde du compte

		return transaction.getMontant(); // Retourne le montant de la transaction

	}

	public void gererPatrimoine(Client clientFortune, float montantPlacement, Bourse villeDePlacement,
			Compte comptenormal, ComptePlacement comptebourse) {
		Transaction virementriche; // Parametres gererPatrimoine changés par rapport au UML
		virementriche = new Transaction(clientFortune, montantPlacement, comptenormal, comptebourse); // Au final
																										// revient à
																										// faire une
																										// transaction
																										// entre 2
																										// comptes
		virementCompteACompte(virementriche);
	}

	@Override
	public String toString() {
		return "ConseillerService [conseiller=" + conseiller + ", listeClients=" + listeClients + "]";
	}

	public static float simulationCredit(Credit credit) {

		float interets = (credit.getMontant() * credit.getTaux() * credit.getDureeEnMois()) / 12000; // Fait le calcul
																										// d'interets

		return interets;
	}

	// public Compte(float solde, int numDeCompte, String dateOuverture, int tel)
	public void modifCompte(float solde, int numDeCompte, String dateOuverture, int tel) {
		/*
		 * listeClients.get(index).setSolde(solde);
		 * listeClients.get(index).setNumDeCompte(numDeCompte);
		 * listeClients.get(index).setdDateOuverture(dateOuverture);
		 * listeClients.get(index).setTtel(tel);
		 */
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public ArrayList<Client> getListeClients() {
		return listeClients;
	}
}
