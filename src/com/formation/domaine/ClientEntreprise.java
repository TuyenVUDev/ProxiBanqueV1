package com.formation.domaine;

public class ClientEntreprise extends Client {

	// proprietes
	private String nomEntreprise;

	// getters/setters
	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	// constructeur
	
		// TODO Auto-generated constructor stub
	

	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param ville
	 * @param codePostal
	 * @param compte1
	 * @param compte2
	 * @param typeClient
	 */
	public ClientEntreprise(String nom, String prenom, String adresse, String ville, int codePostal, Compte compte1,
			Compte compte2, String typeClient) {
		super(nom, prenom, adresse, ville, codePostal, compte1, compte2, typeClient);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public ClientEntreprise() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ClientEntreprise [nomEntreprise=" + nomEntreprise + ", adresse=" + adresse + ", ville=" + ville
				+ ", codePostal=" + codePostal + ", compte1=" + compte1 + ", compte2=" + compte2 + ", typeClient="
				+ typeClient + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

	

}
