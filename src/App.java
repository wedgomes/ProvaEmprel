import Model.AnimalComplaint;
import Model.Complaint;

public class App {

	public static void main(String[] args) {
		AnimalComplaint complaint = new AnimalComplaint("Texto1", "Texto2", "Texto3");
		
		complaint.RegistrarReclamacao();

	}

}
