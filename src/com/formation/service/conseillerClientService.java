package com.formation.service;

import java.util.ArrayList;
import java.util.Collection;

import com.formation.domaine.Client;
import com.formation.domaine.ClientEntreprise;
import com.formation.domaine.ClientFortune;
import com.formation.domaine.ClientNormal;
import com.formation.domaine.Compte;
import com.formation.domaine.ComptePlacement;
import com.formation.domaine.Conseiller;
import com.formation.domaine.Credit;
import com.formation.domaine.Transaction;

public class conseillerClientService {

	private Conseiller conseiller;
	ArrayList<Client> listeClients = new ArrayList<Client>();

	public conseillerClientService(Conseiller conseiller) {
		super();
		this.conseiller = conseiller;
	}

	public boolean creerClient(String nom, String prenom, String adresse, int codePostal, String ville,
			Compte compte1,Compte compte2, String typeClient) {
			if (typeClient.equals("clientNormal")) {
				ClientNormal nouveauClient = new ClientNormal(nom, prenom, adresse, ville,
						codePostal, null, null, typeClient);
				listeClients.add(nouveauClient);
				conseiller.setListeClientConseilles(listeClients);
				return true;
			}

			else if (typeClient.equals("clientFortune")) {
				ClientFortune nouveauClient = new ClientFortune(nom, prenom,adresse,
						ville, codePostal, null, null, typeClient);
				listeClients.add(nouveauClient);
				conseiller.setListeClientConseilles(listeClients);
				return true;
			}

			else if (typeClient.equals("clientEntreprise")) {
				ClientEntreprise nouveauClient = new ClientEntreprise(nom, prenom,adresse,
						ville, codePostal, null, null, typeClient);
				listeClients.add(nouveauClient);
				conseiller.setListeClientConseilles(listeClients);
				return true;
			} else
				return false; // Renvoie false si aucun client n'a été crée
		} 


	public void supprimerClient(int index) {
		listeClients.remove(index);

	}

	public void modifInfoClient(int index, String nom, String prenom, String ville, String adresse, int codePostal) {
		listeClients.get(index).setNom(nom);
		listeClients.get(index).setPrenom(prenom);
		listeClients.get(index).setVille(ville);
		listeClients.get(index).setAdresse(adresse);
		listeClients.get(index).setCodePostal(codePostal);

	}

	public String getInfoClient(int index) {
		return listeClients.get(index).toString();
	}

	@Override
	public String toString() {
		return "Conseiller " + conseiller
				+ ", listeClients=" + listeClients + "]";
	}

	//getter/setter
	public Conseiller getConseiller() {
		return conseiller;
	}

	public ArrayList<Client> getListeClients() {
		return listeClients;
	}
}
