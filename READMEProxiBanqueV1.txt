
BONJOUR,
MERCI DE NOUS AVOIR CHOISI POUR LE DEVELOPPEMENT DE PROXYBANQUESI
les développeurs sont :
Alexandre Piccini
Tuyen VU

1) Installation
Téléchargez le dossier ProxyBanqueV1 et placez le dans le dossier de votre choix.
Ouvre Eclipse et cliquez sur File->Import ->Existing Projects into Workspace

Il doit y avoir 3 packages: com.formation.presentation, com.formation.service, com.formation.domaine
Si le projet n'est pas importé, testez File->Import ->File System
Regardez le dossier lib, il contient 2 fichiers hamcrest-core et jUnit4.12, sélectionnez-les, clic droit et faites build path pour qu'ils puissent être utilisés pour les test unitaires


Félicitations, vous venez de télécharger PROXYBANQUESIV1

2) Utilisation

Allez dans le package presentation et lancez le fichier ProxiBanqueSI comme application Java
Dans une logique d'utilisation :
	1 creation d'un client
	2 creation d'un compte
	3 operations virement/simulation credit
	
	

3) Javadoc
N'hésitez pas à consulter la javadoc pour avoir des renseignements pour les classes et méthodes.
Une plus grande attention a été portée sur la documentation des méthodes que du constructeur, dans un soucis de prioriétés.

4) Tests Unitaires
Peu de tests unitaires ont été implémentés faute de temps.
Ils sont surtout concentrés sur la création des objets Comptes et Clients. Le fichier TestsProxybanque contient les méthodes qui renverons des booleans ou les objets d'interets.
Les quelques tests que nous avons réalisés sont concluants et tournent (cf printscreen) mais ont un problème d'initialisation non résolus sur certains ordinateurs(?) contactez nous si besoin

5) Commentaires
Pour tous commentaire, vous pouvez nous joindre à cette adresse email : PIVU@gmail.com


6) MISE EN GARDE :
toutes les fonctionnalites ne sont pas encore implementees. Le programme fourni se limite a l'usage d'un conseiller unique.
les fonctionnalites du gerant ne sont pas encore faites mais la majorite sont presentes.
les entrees consoles doivent etre respectees car les erreurs ne sont pas encore prises en charge.
avertissement sur la fonctionnalite "audit" : renvoie une erreur s'il existe un client sans compte.
