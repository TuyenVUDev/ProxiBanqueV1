package com.formation.domaine;

public class CreditConso extends Credit {

	// Constructeur
	public CreditConso(Client client, float taux, int dureeEnMois, int mensualites, float montant) {
		super(client, taux, dureeEnMois, mensualites, montant);
		// TODO Auto-generated constructor stub

	}

	// get setters

	@Override
	public String toString() {
		return "CreditConso []";
	}

}
