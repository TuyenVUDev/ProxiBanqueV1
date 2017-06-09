package com.formation.domaine;

/**
 * 
 * Classe fille de @see Credit
 * Servira a definir la specificite des credits de consommations
 */


public class CreditImmo extends Credit {

	public CreditImmo(Client client, float taux, int dureeEnMois, int mensualites, float montant) {
		super(client, taux, dureeEnMois, mensualites, montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CreditImmo [toString()=" + super.toString() + ", getClient()=" + getClient() + ", getTaux()="
				+ getTaux() + ", getDureeEnMois()=" + getDureeEnMois() + ", getMensualites()=" + getMensualites()
				+ ", getMontant()=" + getMontant() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
}
