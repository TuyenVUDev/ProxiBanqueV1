package com.formation.domaine;

public class CompteCourant extends Compte {

		private float decouvert = 1000;

	
	public CompteCourant(float solde, int numDeCompte, String dateOuverture, int tel) {
		super(solde, numDeCompte, dateOuverture, tel);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "CompteCourant [decouvert=" + decouvert + "]";
	}

}
