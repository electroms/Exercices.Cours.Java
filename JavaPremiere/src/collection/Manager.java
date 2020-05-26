package collection;

/**
 * @author Lucien Martos
 */
public class Manager extends Employe {

	/**
	 * Constructeur du Manager, cree a partir du constructeur d'Employe
	 * 
	 * @param pNom
	 * @param pPrenom
	 * @param pId
	 */
	public Manager(String pNom, String pPrenom, int pId) {
		super(pNom, pPrenom, pId);
	}
	
	public Manager(String pNom, String pPrenom) {
		super(pNom, pPrenom, 0);
	}
	
	public Manager(String pNom) {
		super(pNom, "Yoro", 0);
	}

	public Manager() {
		super("DIOP", "Yoro", 0);
	}

	/**
	 * Le manager peut valider les demandes de formation de ses employes
	 */
	public void validerFormation() {
		// sortie console . Ici plus possible d'utiliser this.nom !!
		System.out.println("Le manager " + getPrenom() + " " + getNom()
				+ " valide les demandes de formation de ses employes.");

	}

	@Override
	public void demanderFormation(String theme) {
		
		super.demanderFormation(theme);
		System.out.println("Etant Manager, il valide ses propres formations" );
	}
	
	

}
