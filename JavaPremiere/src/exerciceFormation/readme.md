#Exercice Formation

##Un Employe est caractérisé par un id de type int, un nom de type String et un prenom de
type String;

###Methode
demanderFormation prendra en parametre un theme de type String et retournera l’instance
de DemandeFormation

###Un Manager est un Employe qui valide les Formations de ces Employés

###Methode
valideFormation prendra en parametre une instance de DemandeFormation et un String

###motif

Une DemandeFormation est caractérisé par

String theme;

String dateDemande;

String dateDebut;

String dateFin;

String etatValidation;

Elle possedera des variables de classes constantes publiques

String REFUS = "refus";

String ACCORDE = "valide";

String ATTENTE = "en attente";
Lors de la demande l’etatValidation sera à ATTENTE