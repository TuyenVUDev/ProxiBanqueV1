package com.formation.domaine;

public class Credit {
	//Declaration
	private Client client;
	private float taux; 
	private int dureeEnMois, mensualites;
	private float montant;
	
	//Constructeur
	public Credit(Client client, float taux, int dureeEnMois, int mensualites, float montant) {
		super();
		this.client = client;
		this.taux = taux;
		this.dureeEnMois = dureeEnMois;
		this.mensualites = mensualites;
		this.montant = montant;
	}

//toString
	@Override
	public String toString() {
		return "Credit [client=" + client + ", taux=" + taux + ", dureeEnMois=" + dureeEnMois + ", mensualites="
				+ mensualites + ", montant=" + montant + "]";
	}

//Getters setters
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
