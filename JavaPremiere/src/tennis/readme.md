#Gestion de club de tennis

##Un club de tennis possède des terrains ou les joueurs licenciés jouent.

1 Créer une classe Personne avec comme attributs le nom, le prénom et l’age.

2 Créer une classe Joueur qui hérite de la classe Personne. Il aura comme attribut supplémentaire la

##catégorie du joueur qui tient compte de l’age :
###inférieur à 20 exclus : catégorie Débutant
###de 20 inclus à 50 exclus : catégorie Junior
###au dessus de 50 inclus : catégorie Sénior

##il aura également un attribut qui indique le classement dans sa catégorie
###Créer une classe Arbitre.

3 Créer un classe terrain avec comme attribut numéro et ville et Arbitre

4 Créer une classe Club qui a comme attributs :

##Une collection de joueurs,

##Une collection de terrains.

###Dans une classe Principale, vous instancierez 10 joueurs dont 3 seront « Jeune », 4 « Junior » et 3
« Sénior », vous etes libre d’établir la valeur pour le classement.

##Vous instancierez 4 terrains de 3 villes différentes

##Vous instancierez un Club qui possède les terrains et les joueurs

##Vous afficherez les joueurs classés par leur nom prenom age

##Vous afficherez les joueurs classes par catégorie et classement dans chaque catégorie
##Un tournois sera organisé. Pour la gestion des matchs, des joueurs seront affectés à des terrains
d’une seule vielle. Vous mettrez la liste des joueurs et le terrain dans une HashMap.

##Vous afficherez les terrains avec pour chacun deux les joueurs affectés comme ceci :
Terrain Rose => [ Affre Paul n°3 Jeune, Martin Pierre n°2 Senior, …]