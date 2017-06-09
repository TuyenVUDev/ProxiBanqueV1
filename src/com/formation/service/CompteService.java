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



	public static  float virementCompteACompte(Transaction transaction) { //Fait le virement d'un compte à l'autre.
		float finalCompteDebite = transaction.getCompteDebite().getSolde() - transaction.getMontant();  //Credit du compte débité après opération
		float finalCompteCredite = transaction.getCompteCredite().getSolde() + transaction.getMontant(); //Credit du compte crédité après opération
		transaction.getCompteDebite().setSolde(finalCompteDebite); //Fixe le solde du compte
		transaction.getCompteCredite().setSolde(finalCompteCredite); //Fixe le solde du compte

		return transaction.getMontant(); //Retourne le montant de la transaction
		
	}

	public void gererPatrimoine(ClientFortune clientFortune, float montantPlacement, Bourse villeDePlacement,Compte comptenormal, ComptePlacement comptebourse) {
		Transaction virementriche; //Parametres gererPatrimoine changés par rapport au UML
		virementriche = new Transaction(clientFortune, montantPlacement, comptenormal, comptebourse); //Au final revient à faire une transaction entre 2 comptes
		virementCompteACompte(virementriche);
	}

	
	
	@Override
	public String toString() {
		return "ConseillerService [conseiller=" + conseiller
				+ ", listeClients=" + listeClients + "]";
	}

	public float simulationCredit(Credit credit) {
		
		float interets =  ( credit.getMontant() * credit.getTaux() * credit.getDureeEnMois() ) / 12; //Fait le calcul d'interets
		
		return interets;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}


	public ArrayList<Client> getListeClients() {
		return listeClients;
	}
}
