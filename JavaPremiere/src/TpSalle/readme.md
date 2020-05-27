
#Exercice2
##Couche métier

1. Définir une classe Salle avec les attributs suivants : id, code et libelle.

2. Définir les accesseurs aux différents attributs de la classe.

3. Définir un constructeur permettant d’initialiser les attributs d'un objet salle par des
valeurs saisies par l’utilisateur. Sachant que Id doit être auto-incrément.

4. Définir la méthode toString ( ) permettant d’afficher les informations de la salle en
cours.

##Couche accès aux données

1. Créer l'interface IDao avec les méthodes :

○ boolean create ( Salle o) : Méthode permettant d'ajouter un objet o.

○ boolean delete (Salle o) : Méthode permettant de supprimer un objet o.

○ boolean update (Salle o) : Méthode permettant de modifier un objet o.

○ Salle find (int id) : Méthode permettant de renvoyer un objet dont id est passé
en paramètre.

○ List <Salle> findAll ( ) : Méthode permettant de renvoyer la liste des objets de

##type Salle.

2. Créer la classe SalleService qui implémente l'interface IDao. Dans cette classe les
données seront stockés dans une collection de type List.

3. Dans la classe SalleService, vous ajouterez deux methodes :

○ Sauvegarde les salles de la collection dans un fichier (chaque ligne du fichier
representera une salle id;code;libelle avec le separateur “;” ), vous utiliserez
un BufferedWriter

○ Restaure les salles de la collection à partir de ce fichier, vous utiliserez un
BufferedReader,

##Couche de présentation

1. Dans une classe de test :

○ Créer cinq salles.

○ Afficher la liste des salles.

○ Supprimer une salle.

○ Modifier les informations d'une salle.

○ Afficher la liste des salles.

○ Sauvegarder les salles

○ Supprimer deux salles

○ Restaurer les salles sauvegarder et les afficher
