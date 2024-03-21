
public class Box {
	private int size;
	private Toy toy;
	public Box(int size, Toy toy) {
		super();
		this.size = size;
		this.toy = toy;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Toy getToy() {
		return toy;
	}
	public void setToy(Toy toy) {
		this.toy = toy;
	}
}
