package Model;

public abstract class Complaint {
	private String descricaoQueirxa;
	private String obsQueixa;
	private String nomeSolicitante;
	
	public Complaint(String descricaoQueirxa, String obsQueixa, String nomeSolicitante) {
		super();
		this.descricaoQueirxa = descricaoQueirxa;
		this.obsQueixa = obsQueixa;
		this.nomeSolicitante = nomeSolicitante;
	}
	
	

	public abstract void RegistrarReclamacao();
	public abstract Complaint ConsultarReclamacao(Object objeto);
	public abstract void AtualizarReclamacao();
	
	
	public String getDescricaoQueirxa() {
		return descricaoQueirxa;
	}

	public void setDescricaoQueirxa(String descricaoQueirxa) {
		this.descricaoQueirxa = descricaoQueirxa;
	}

	public String getObsQueixa() {
		return obsQueixa;
	}

	public void setObsQueixa(String obsQueixa) {
		this.obsQueixa = obsQueixa;
	}

	public String getNomeSolicitante() {
		return nomeSolicitante;
	}

	public void setNomeSolicitante(String nomeSolicitante) {
		this.nomeSolicitante = nomeSolicitante;
	}
	
	
	
}
