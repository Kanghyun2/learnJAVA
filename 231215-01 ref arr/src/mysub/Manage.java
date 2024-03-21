package mysub;

public class Manage {

	private ID[] ids;

	public Manage(int capacity) {
		this.ids = new ID[capacity];
		for (int i = 0; i < ids.length; i++) {
			ids[i] = null;
		}
	}

	public ID[] getIds() {
		return ids;
	}

	public void setIDAuto(ID id) {
		for (int i = 0; i < ids.length; i++) {
			if (ids[i] == null) {
				ids[i] = id;
			}
		}
	}

	public boolean contain(String id, String password) {
		for (int i = 0; i < ids.length; i++) {
			if (ids[i] != null) {
				if (ids[i].match(id, password)) {
					return true;
				}
			}
		}
		return false;
	}

}
