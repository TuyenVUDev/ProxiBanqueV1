package com.formation.domaine;

public class ComptePlacement extends Compte {

	private Bourse villeDePlacement;
	public ComptePlacement(float solde, int numDeCompte, String dateOuverture, int tel, String ville) {
		super(0, numDeCompte, dateOuverture, tel);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Compte de Placement Solde : " + solde  +"    " + numDeCompte + "";
	}


	
	
	
	
	
	
	
}
