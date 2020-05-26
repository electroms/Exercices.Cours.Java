JavaSE Exceptions
1. Code initial et premières manipulations
L'auvergnat apprécie tout ce qui lui permet d'être économe. Penchons-nous sur la classe
CompteBancaire...
public class CompteBancaire {
private double solde = 0.0; // solde du compte
private double decouvert = -700.; // découvert autorisé
public void retrait(double montant) {
double nouveau = solde - montant;
if (montant<0.0)
System.out.println("Mauvais montant");
else if (nouveau<decouvert)
System.out.println("Operation impossible : le compte serait trop debiteur");
else solde = nouveau;
}
}
La première étape est d'ajouter une méthode main() à la classe CompteBancaire et
d'instancier la classe. Vous pouvez ajouter une méthode toString() ou un getter pour
connaître la valeur du solde du compte et proposer un constructeur pour changer la valeur
initiale du compte.
2. Les exceptions
La classe telle qu'elle est présentée affiche un message d'erreur sur la sortie standard en
cas de pépin. Nous pourrions gérer les cas exceptionnels avec le type de retour de la
méthode mais rien n'empêche l'utilisateur de s'assoir sur l'erreur alors dans un soucis de
transparence, nous allons utiliser le mécanisme des exceptions.
2.1. Montant négatif
Nous allons tout d'abord utiliser une exception de la plateforme Java lorsque le paramètre
fourni à la méthode retrait() est négatif.
throw new IllegalArgumentException("Mauvais montant");
La ligne précédente permet de faire deux choses : instancier une nouvelle exception et la
jeter : nous utilisons alors le mécanisme de gestion des exceptions.
À la compilation, vous obtenez une erreur : le compilateur veut que vous régliez le problème
engendré par cette exception. Ne vous jettez pas sur le try/catch, ce n'est pas ce que l'on
veut : on veut avertir toute méthode appelant retrait() qu'il peut y avoir un problème. Vous
devez modifier la signature de la méthode retrait() et gérer dans la méthode main() le
problème :
● Modifier la signature de main() ou bien
● Utiliser un bloc try/catch dans la méthode main() (et c'est ce qui semble le plus
indiqué)
En tout cas, vous ne pouvez pas ne rien faire, cela ne marche pas !
2.2. Solde trop négatif
On vous propose de gérer le cas où le solde devient trop négatif en jetant une instance
d'AutorisationException où AutorisationException est une exception personnalisée (une
classe dérivant d'une exception, au pire java.lang.Exception).
2.3. Code du cours
Pour info, voilà la classe telle qu'elle a été donnée dans le support de cours :
Et voilà !
public class CompteBancaire {
private double solde = 0.0; // solde du compte
private double decouvert = -700.; // découvert autorisé
public void retrait(double montant)
throws IllegalArgumentException, AutorisationException {
double nouveau = solde - montant;
if (montant<0.0)
throw new IllegalArgumentException("Mauvais montant");
if (nouveau<decouvert)
throw new AutorisationException();
solde = nouveau;
}
}
Le mécanisme des exceptions est complètement intégré au langage : il permet d'avoir un
code sécurisé et de faire une gestion des cas exceptionnels très propre et surtout de
respecter le principe de génie logiciel objet à savoir ne pas appliquer la politique de
l'autruche sur les erreurs potentielles à l'exécution.