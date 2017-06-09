package com.formation.domaine;

/**
 * 
 * 
 *
 * Classe dans l'architecture domaine, classe heritee de Client,
 *         est destinne aux entreprises. Il est conseillé en général pour un compteEntreprise de renseigner les données du CEO
 * 
 * 
 */

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

	public ClientEntreprise(String nom, String prenom, String adresse, String ville, int codePostal, Compte compte1,
			Compte compte2, String typeClient) {
		super(nom, prenom, adresse, ville, codePostal, compte1, compte2, typeClient);
		// Il est conseillée de rentrer le nom du CEO comme client
	}

	public ClientEntreprise() {
		super();
	}

	@Override
	public String toString() {
		return "ClientEntreprise [nomEntreprise=" + nomEntreprise + ", adresse=" + adresse + ", ville=" + ville
				+ ", codePostal=" + codePostal + ", compte1=" + compte1 + ", compte2=" + compte2 + ", typeClient="
				+ typeClient + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

}
