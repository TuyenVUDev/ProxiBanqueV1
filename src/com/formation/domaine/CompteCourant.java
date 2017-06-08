package com.formation.domaine;

public class CompteCourant extends Compte {

		private float decouvert = 1000;

	//Constructeur
	public CompteCourant(float solde, int numDeCompte, String dateOuverture, int tel) {
		super(solde, numDeCompte, dateOuverture, tel);
		// TODO Auto-generated constructor stub
	}
	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CompteCourant [decouvert=" + decouvert +"    " + solde  +"    " + numDeCompte + "]";
	}

	/* 
	 * Nous construisons un CompteCourant avec la surcharge de constructeur.
	 * Problème, les valeurs de solde, numDeCompte, dateOuverture, tel, ne sont pas des caractéristiques de CompteCourant, je ne peux pas les getter et setter
	 * Solution 1) redéclararer en private des variables et les utiliser dans le constructeur et utiliser des getters et setters
	 * Pb : autant rendre les attributs de compte protected, mais il doit bien y avoir un autre moyen?
	 * 
	 * 
	 * */
 
	
	
	
/*
	@Override
	public float getSolde() {
		return solde;
	}
	@Override
	public void setSolde(float solde) {
		this.solde = solde;
	}
	@Override
	public int getNumDeCompte() {
		return numDeCompte;
	}
	@Override
	public void setNumDeCompte(int numDeCompte) {
		this.numDeCompte = numDeCompte;
	}
	@Override
	public String getDateOuverture() {
		return dateOuverture;
	}
	@Override
	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	@Override
	public int getTel() {
		return tel;
	}
	@Override
	public void setTel(int tel) {
		this.tel = tel;
	}
	*/
	
	
	
	
	
}
