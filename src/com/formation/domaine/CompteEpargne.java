package com.formation.domaine;

public class CompteEpargne extends Compte{

	
	public CompteEpargne(float solde, int numDeCompte, String dateOuverture, int tel) {
		super(solde, numDeCompte, dateOuverture, tel);
		// TODO Auto-generated constructor stub
	}

	private float tauxDeRemuneration = 3;

	@Override
	public String toString() {
		return "CompteEpargne [tauxDeRemuneration=" + tauxDeRemuneration + "]";
	}
	
	
}
