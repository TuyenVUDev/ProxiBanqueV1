package com.formation.tests;

import com.formation.domaine.ClientEntreprise;
import com.formation.domaine.ClientFortune;
import com.formation.domaine.ClientNormal;
import com.formation.domaine.Compte;
import com.formation.domaine.CompteCourant;
import com.formation.domaine.CompteEpargne;
import com.formation.domaine.CompteFortune;
import com.formation.domaine.Transaction;

public class TestsProxybanque {

	public static Compte testCompte(float solde, int numDeCompte, String dateOuverture, int tel, String typeCompte) {
		//Methode retournant un compte complet
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
	}
	
	
	public static boolean testCompteBool(float solde, int numDeCompte, String dateOuverture, int tel, String typeCompte) {
		if (typeCompte.equals("compteNormal")) {
			//Methode retournant un boolean indiquant si le compte a été crée

			if (solde > 500000) {
				CompteFortune nouveauPlacement = new CompteFortune(solde, numDeCompte, dateOuverture, tel);
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

	}
	
	
	
	
	public static boolean creerClientTestBool(String nom, String prenom, String adresse, int codePostal, String ville,
			Compte compte1,Compte compte2, String typeClient) {
		//Methode retournant un boolean indiquant si le client a été crée

			if (typeClient.equals("clientNormal")) {
				ClientNormal nouveauClient = new ClientNormal(nom, prenom, adresse, ville,
						codePostal, null, null, typeClient);

				return true;
			}

			else if (typeClient.equals("clientFortune")) {
				ClientFortune nouveauClient = new ClientFortune(nom, prenom,adresse,
						ville, codePostal, null, null, typeClient);
				
				return true;
			}

			else if (typeClient.equals("clientEntreprise")) {
				ClientEntreprise nouveauClient = new ClientEntreprise(nom, prenom,adresse,
						ville, codePostal, null, null, typeClient);
				
				return true;
			} else
				return false; // Renvoie false si aucun client n'a Ã©tÃ© crÃ©e
		} 
	
	
}
