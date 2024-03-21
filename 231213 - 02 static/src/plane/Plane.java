package plane;

public class Plane {

	private String model;
	private String production;
	private int maxPassenger;
	public static int planeCount = 0;
	public static final int SPEED_OF_SOUND = 340;
	
	public static int getPlaneCount() {
		return planeCount;
	}
	
	public Plane(String model, String production) {
		this(model, production, 250);
	}

	public Plane(String model, String production, int maxPassenger) {
	this.model = model;
	this.production = production;
	this.maxPassenger = maxPassenger;
	planeCount++;
	}
	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


}
