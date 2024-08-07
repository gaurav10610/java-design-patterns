package solid.interfacesegregation;

/**
 *
 * Larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing
 * classes only need to be concerned about the methods that are of interest to them.
 *
 */
public class MainClass {

	public static void main(String[] args) {
		
		WorkerImpl worker = new WorkerImpl();
		
		worker.paint();
		worker.construct();

	}

}
