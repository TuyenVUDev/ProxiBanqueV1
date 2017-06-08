package com.formation.service;

import java.util.ArrayList;
import java.util.Collection;

import com.formation.domaine.Bourse;
import com.formation.domaine.Client;
import com.formation.domaine.ClientEntreprise;
import com.formation.domaine.ClientFortune;
import com.formation.domaine.ClientNormal;
import com.formation.domaine.Compte;
import com.formation.domaine.ComptePlacement;
import com.formation.domaine.Conseiller;
import com.formation.domaine.Credit;
import com.formation.domaine.Transaction;

public class ConseillerService {

	private Conseiller conseiller;
	ArrayList<Client> listeClients = new ArrayList<Client>();

	public void clientInitiaux() {
		Client client1, client2, client3, client4;
		client1 = new ClientNormal("Rue val Fontaine","Saint genis les Ollières",69290,,"clientNormal"); 
		
		/*private String adresse;
	private String ville;
	private int codePostal;
	private Compte compte;
	private String typeClient;
		 * 
		 * 
		 * 
		 * */
	};

	public boolean creerClient(String adresse, int codePostal, String ville, Compte compte, String typeClient) {
		if (typeClient.equals("clientNormal")) { 
			ClientNormal nouveauClient = new ClientNormal();
			listeClients.add(nouveauClient);
			return true;
		}

		else if (typeClient.equals("clientFortune")) {
			ClientFortune nouveauClient2 = new ClientFortune();
			listeClients.add(nouveauClient2);
			return true;
		}

		else if (typeClient.equals("clientEntreprise")) {
			ClientEntreprise nouveauClient3 = new ClientEntreprise();
			listeClients.add(nouveauClient3);
			return true;
		} else
			return false; //Renvoie false si aucun client n'a été crée

	}

	public void supprimerClient(Client client) {
		// int retval = listeClients.indexOf(client);
		listeClients.remove(client);

	}

	public void voidmodifInfoClient(Client client) {

	}

	public String getInfoClient(Client client) {
		return client.toString();
	}

	public  float virementCompteACompte(Transaction transaction) { //Fait le virement d'un compte à l'autre.
		float finalCompteDebite = transaction.getCompteDebite().getSolde() - transaction.getMontant();  //Credit du compte débité après opération
		float finalCompteCredite = transaction.getCompteCredite().getSolde() + transaction.getMontant(); //Credit du compte crédité après opération
		transaction.getCompteDebite().setSolde(finalCompteDebite); //Fixe le solde du compte
		transaction.getCompteCredite().setSolde(finalCompteCredite); //Fixe le solde du compte

		return transaction.getMontant(); //Retourne le montant de la transaction
		
	}

	public void gererPatrimoine(ClientFortune clientFortune, float montantPlacement, Bourse villeDePlacement,
			ComptePlacement comptePlacement) {
	}

	
	
	public float simulationCredit(Credit credit) {
		/* 	public Credit(Client client, float taux, int dureeEnMois, int mensualites, float montant) {
		super();
		this.client = client;
		this.taux = taux;
		this.dureeEnMois = dureeEnMois;
		this.mensualites = mensualites;
		this.montant = montant;
	}
		*/
		
		float interets =  ( credit.getMontant() * credit.getTaux() * credit.getDureeEnMois() ) / 12; 
		
		return interets;
	}
}
