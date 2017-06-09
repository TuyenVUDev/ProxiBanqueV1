package com.formation.domaine;

/**
 * 
 * Classe fille de @see Credit
 * Servira a definir la specificite des credits de consommations
 */


public class CreditConso extends Credit {

	// Constructeur
	public CreditConso(Client client, float taux, int dureeEnMois, int mensualites, float montant) {
		super(client, taux, dureeEnMois, mensualites, montant);

	}

	@Override
	public String toString() {
		return "CreditConso [toString()=" + super.toString() + ", getClient()=" + getClient() + ", getTaux()="
				+ getTaux() + ", getDureeEnMois()=" + getDureeEnMois() + ", getMensualites()=" + getMensualites()
				+ ", getMontant()=" + getMontant() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


	
}
