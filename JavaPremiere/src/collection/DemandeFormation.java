package collection;

/**
 * @author  Lucien Martos
 */

public class DemandeFormation {

	// Proprietes d'une demande de formation
	private String theme;
	private String dateDemande;
	private String dateDebut;	
	private String dateFin;
	private String etatValidation;
	
	public final static String REFUS = "refus";
	public final static String ACCORDE = "valide";
	public final static String ATTENTE = "en attente";
	
	
	// Constructeur
	public DemandeFormation(String pTheme, String pDateDemande, String pDateDebut, String pDateFin, String pEtatValidation){
		this.theme = pTheme;
		this.dateDemande = pDateDemande;
		this.dateDebut = pDateDebut;
		this.dateFin = pDateFin;
		this.etatValidation = pEtatValidation;
	}
	
	// Surcharge de constructeur
	public DemandeFormation(String pTheme, String pDateDemande, String pDateDebut, String pDateFin){
		this(pTheme,pDateDemande,pDateDebut,pDateFin,DemandeFormation.ATTENTE);
	}

	// Getters et Setters
		
	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	
	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(String dateDemande) {
		this.dateDemande = dateDemande;
	}
	
	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public String getEtatValidation() {
		return etatValidation;
	}
		
	public void setEtatValidation(String etatValidation) {
		this.etatValidation = etatValidation;
	}

}
