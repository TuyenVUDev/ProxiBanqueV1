package com.formation.domaine;

/**
 * 
 * Classe caracterisant un credit avec sa durée, son montant de base, son taux et la mensualite max de remboursement
 */



public class Credit {
	// Declaration
	private Client client;
	private float taux;
	private int dureeEnMois, mensualites;
	private float montant;
	/**
	 * 
	 * @param client indique le client pour le credit
	 * @param taux le taux d interet, en float
	 * @param dureeEnMois la duree du pret
	 * @param mensualites la mensualite maximale que l on peut pqyer
	 * @param montant le montant du pret que l on souhaite
	 */

	// Constructeur
	public Credit(Client client, float taux, int dureeEnMois, int mensualites, float montant) {
		super();
		this.client = client;
		this.taux = taux;
		this.dureeEnMois = dureeEnMois;
		this.mensualites = mensualites;
		this.montant = montant;
	}
	
	public Credit(Client client, float taux, int dureeEnMois, float montant) {
		super();
		this.client = client;
		this.taux = taux;
		this.dureeEnMois = dureeEnMois;
		this.mensualites = 0;
		this.montant = montant;
	}

	// toString
	@Override
	public String toString() {
		return "Credit [client=" + client + ", taux=" + taux + ", dureeEnMois=" + dureeEnMois + ", mensualites="
				+ mensualites + ", montant=" + montant + "]";
	}

	// Getters setters
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}

	public int getDureeEnMois() {
		return dureeEnMois;
	}

	public void setDureeEnMois(int dureeEnMois) {
		this.dureeEnMois = dureeEnMois;
	}

	public int getMensualites() {
		return mensualites;
	}

	public void setMensualites(int mensualites) {
		this.mensualites = mensualites;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

}
