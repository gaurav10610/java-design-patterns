package solid.interfacesegregation;

public class MainClass {

	public static void main(String[] args) {
		
		WorkerImpl worker = new WorkerImpl();
		
		worker.paint();
		worker.construct();

	}

}
