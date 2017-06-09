package com.formation.presentation;

import com.formation.domaine.Client;
import com.formation.domaine.Conseiller;

public class AffichagePortefeuillePresentation {

	void afficherPorteFeuille(Conseiller conseiller) {
		
		for (Client client : conseiller.getListeClientConseilles()) {
			if (conseiller.getListeClientConseilles().indexOf(client) > 9)
				System.out
						.println("Attention, vous avez deja  10 client dans votre portefeuille, contactez le gerant\n");
			else
				System.out.println(conseiller.getListeClientConseilles()
						.indexOf(client)
						+ " : "
						+ client.getNom()
						+ " "
						+ client.getPrenom()
						+ " "
						+ client.getTypeClient()
						+ " "
						+ client.getCompte()
						);
		}
	}
}
