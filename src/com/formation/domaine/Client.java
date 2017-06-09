package com.formation.domaine;

public abstract class Client extends Personne {

	// proprietes
	protected String adresse;
	protected String ville;
	protected int codePostal;
	protected Compte compte1;
	protected Compte compte2;
	protected String typeClient;

	// getters/setters
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public Compte getCompte1() {
		return compte1;
	}

	public void setCompte1(Compte compte1) {
		this.compte1 = compte1;
	}

	public Compte getCompte2() {
		return compte2;
	}

	public void setCompte2(Compte compte2) {
		this.compte2 = compte2;
	}

	public String getTypeClient() {
		return typeClient;
	}

	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}

	public Client() {
		super();
	}

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
	public Client(String nom, String prenom, String adresse, String ville, int codePostal, Compte compte1,
			Compte compte2, String typeClient) {
		super(nom, prenom);
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = codePostal;
		this.compte1 = compte1;
		this.compte2 = compte2;
		this.typeClient = typeClient;
	}

	@Override
	public String toString() {
		return "Client [adresse=" + adresse + ", ville=" + ville + ", codePostal=" + codePostal + ", compte1=" + compte1
				+ ", compte2=" + compte2 + ", typeClient=" + typeClient + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

	// constructeur

}
