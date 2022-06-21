package Model;

public class AnimalComplaint extends Complaint{

	public AnimalComplaint(String descricaoQueirxa, String obsQueixa, String nomeSolicitante) {
		super(descricaoQueirxa, obsQueixa, nomeSolicitante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void RegistrarReclamacao() {
		if(Reclamacao != null) {
			new Reclamacao();
		}
		
	}

	@Override
	public Complaint ConsultarReclamacao(Object objeto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void AtualizarReclamacao() {
		// TODO Auto-generated method stub
		
	}

}
