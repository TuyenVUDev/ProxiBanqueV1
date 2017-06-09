package com.formation.domaine;

public class CompteFortune extends Compte{


	public CompteFortune(float solde, int numDeCompte, String dateOuverture, int tel) {
		super(solde, numDeCompte, dateOuverture, tel);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Compte de Client riche Solde : " + solde  +"    " + numDeCompte + "";
	}


	
	
}
