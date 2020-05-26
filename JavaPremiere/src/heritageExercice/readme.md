#Le directeur d'une entreprise de produits chimiques souhaite gérer les salaires et primes de ses employés au
moyen d'un programme Java.

##Un employé est caractérisé par son nom, son prénom, son âge et sa date d'entrée en service dans l'entreprise.

##Codez une classe abstraite Employe dotée des attributs nécessaires, d'une méthode abstraite calculerSalaire (ce
calcul dépendra en effet du type de l'employé) et d'une méthode getNom retournant une chaine de caractère
obtenue en concaténant la chaine de caractères "L'employé " avec le prénom et le nom.

##Dotez également votre classe d'un constructeur prenant en paramètre l'ensemble des attributs nécessaires.
Calcul du salaire

##Le calcul du salaire mensuel dépend du type de l'employé. On distingue les types d'employés suivants :

● Ceux affectés à la Vente. Leur salaire mensuel est le 20 % du chiffre d'affaires qu'ils réalisent
mensuellement, plus 400 Euros.

● Ceux affectés à la Représentation. Leur salaire mensuel est également le 20 % du chiffre d'affaires
qu'ils réalisent mensuellement, plus 800 Euros.

● Ceux affectés à la Production. Leur salaire vaut le nombre d'unités produites mensuellement
multipliées par 5.

● Ceux affectés à la Manutention. Leur salaire vaut leur nombre d'heures de travail mensuel multipliées
par 15 euros.
Codez les classes pour tous les employés en respectant les conditions suivantes :

● La super-classe de la hiérarchie doit être la classe Employe.

● Les nouvelles classes doivent contenir les attributs qui leur sont spécifiques ainsi que le codage
approprié des méthodes calculerSalaire et getNom, en changeant le mot "employé" par la catégorie
correspondante.

● Chaque sous classe est dotée de constructeur prenant en argument l'ensemble des attributs
nécessaires.