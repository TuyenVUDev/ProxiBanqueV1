package com.formation.domaine;

public class ComptePlacement extends Compte {

	private Bourse villeDePlacement;
	public ComptePlacement(float solde, int numDeCompte, String dateOuverture, int tel) {
		super(solde, numDeCompte, dateOuverture, tel);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Ceci est un compte pour placement financier dans la ville de " + villeDePlacement ;
	}


	
	
	
	
	
	
	
}
