package solid.interfacesegregation;

public class WorkerImpl implements PaintWorker, ConstructionWorker {

	@Override
	public void construct() {
		System.out.println("paint work has been done");

	}

	@Override
	public void paint() {
		System.out.println("construction work has been done");

	}

}
