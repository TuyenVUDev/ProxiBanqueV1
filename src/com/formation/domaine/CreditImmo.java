package com.formation.domaine;

public class CreditImmo extends Credit{

	public CreditImmo(Client client, float taux, int dureeEnMois, int mensualites, float montant) {
		super(client, taux, dureeEnMois, mensualites, montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CreditImmo []";
	}

	
	
}
