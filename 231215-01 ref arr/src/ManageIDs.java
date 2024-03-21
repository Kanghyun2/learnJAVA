// 관리 객체 
public class ManageIDs {

	private ID[] ids;

	public ManageIDs(ID[] ids) {
		this.ids = ids;
	}

	// 있냐 없냐 여부
	public boolean contain(String id, String password) {
		for (int i = 0; i < ids.length; i++) {
			if (ids[i].matches(id, password)) {
				return true;
			}
		}
		return false;
	}

}
