package Model;

public class Reclamacao {

	private String descricaoQueixa;
	private String obsQueixa;
	private String nomeSolicitante;
	private String CompSolicitante;
	private String bairroSolicitante;
	private String cidadeSolicitante;
	private String uf, cep;
	private String telefone;
	
	public Reclamacao(String descricaoQueixa, String obsQueixa, String nomeSolicitante, String compSolicitante,
			String bairroSolicitante, String cidadeSolicitante, String uf, String cep, String telefone) {
		super();
		this.descricaoQueixa = descricaoQueixa;
		this.obsQueixa = obsQueixa;
		this.nomeSolicitante = nomeSolicitante;
		CompSolicitante = compSolicitante;
		this.bairroSolicitante = bairroSolicitante;
		this.cidadeSolicitante = cidadeSolicitante;
		this.uf = uf;
		this.cep = cep;
		this.telefone = telefone;
	}

	public String getDescricaoQueixa() {
		return descricaoQueixa;
	}

	public void setDescricaoQueixa(String descricaoQueixa) {
		this.descricaoQueixa = descricaoQueixa;
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

	public String getCompSolicitante() {
		return CompSolicitante;
	}

	public void setCompSolicitante(String compSolicitante) {
		CompSolicitante = compSolicitante;
	}

	public String getBairroSolicitante() {
		return bairroSolicitante;
	}

	public void setBairroSolicitante(String bairroSolicitante) {
		this.bairroSolicitante = bairroSolicitante;
	}

	public String getCidadeSolicitante() {
		return cidadeSolicitante;
	}

	public void setCidadeSolicitante(String cidadeSolicitante) {
		this.cidadeSolicitante = cidadeSolicitante;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
